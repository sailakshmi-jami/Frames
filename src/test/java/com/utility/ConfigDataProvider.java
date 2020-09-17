package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider() {
		File src= new File("./Config/config.properties");
		
			try {
				FileInputStream fis= new FileInputStream(src);
				pro=new Properties();
				pro.load(fis);
			
			} catch (Exception e) {
				System.out.println("not able to config file"+e.getMessage());
			}
		} 
	public String getdatafromconfig(String keytosearch) {
		return pro.getProperty(keytosearch);
	}
	public  String getbrowser() {
		return pro.getProperty("browser");
	}
	public String geturl() {
		return pro.getProperty("url");
	}
	}


