package com.mike.entity;

import java.util.List;

public class User {
	private String userId;
	private String name;
	private String age;
	private String password;
	private String salt;
	
	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getUserId() {
		return userId;
	}

	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public List<SysRole> getRoleList() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
     * 密码盐.
     * @return
     */
    public String getCredentialsSalt(){
        return this.name+this.salt;
    }

}
