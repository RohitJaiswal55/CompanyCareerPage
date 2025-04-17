package com.career.bdd.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties properties;

	/**
	 * Description : Method to read config file.
	 */
	public ConfigReader() {
		try {
			FileInputStream file = new FileInputStream("config.properties");
			properties = new Properties();
			properties.load(file);
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getProperty(String key) {
		return properties.getProperty(key);
	}
}