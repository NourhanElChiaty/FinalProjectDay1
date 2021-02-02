package com.UIAutomationFinalProjectV2.UIAutomationFinalProjectV2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	public String getProperty(String key) throws IOException {
		  Properties prop = new Properties();
		//  File file = new File(System.getProperty("user.dir")+"\\data.properties");
		  FileInputStream input = new FileInputStream(System.getProperty("user.dir")+"\\data.properties");
		  prop.load(input);
		   
		return prop.getProperty(key);
		  
	  }
	  
	  public void setProperty(String key , String value) throws IOException {
		  Properties prop = new Properties();
		  FileInputStream stream = new FileInputStream(System.getProperty("user.dir")+"\\data.properties");
		  prop.load(stream);
		  prop.setProperty(key, value);
		  FileOutputStream output = new FileOutputStream(System.getProperty("user.dir")+"\\data.properties");
		  prop.store(output,"Test comment");
		
	  }
}
