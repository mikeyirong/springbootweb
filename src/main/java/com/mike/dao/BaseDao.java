package com.mike.dao;

import java.util.List;

public interface BaseDao <T>{
	int add(T t);
    int addAll(List<T> tList);
}
