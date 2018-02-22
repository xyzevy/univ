package com.sand.util.properties;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import org.junit.Test;
import org.springframework.stereotype.Component;

@Component
public class PropertiesUtil {
	
	public String readPropertyBykey(String url,String key) {
		InputStream input = this.getClass().getResourceAsStream(url);
		BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		Properties properties = new Properties();
		try {
			properties.load(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if ("null".equals(properties.getProperty(key)) || properties.getProperty(key) == null) {
			return "null";
		}
		return properties.getProperty(key);
	}
	
	
	public Properties getProperties(String url){
		InputStream input = this.getClass().getResourceAsStream(url);
		BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		Properties properties = new Properties();
		try {
			properties.load(reader);
			return properties;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}