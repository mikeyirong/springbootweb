package com.mike.util;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;


public class GengoryMybatisUtil {
	public void generator() throws Exception{
        URL uri=this.getClass().getClassLoader().getResource("generatorConfig.xml");
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		File configFile = new File(uri.getPath()); 
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
				callback, warnings);
		myBatisGenerator.generate(null);

	} 
	public static void main(String[] args) throws Exception {		
		try {
			GengoryMybatisUtil generatorSqlmap = new GengoryMybatisUtil();
			generatorSqlmap.generator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
