package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class Configure_Reader {
      public static Properties prop;
	public Configure_Reader() throws IOException {
		File f = new File("C:\\Users\\ashin\\eclipse-workspace\\GREENKART\\src\\test\\java\\com\\helper\\greenkart.properties");
	    FileInputStream fis = new FileInputStream(f);
	    prop= new Properties();
	    prop.load(fis);
	}
	
	public String geturl()
	{
		String url = prop.getProperty("url");
		return url;
	}
	
	public String getSearchTerm()
	{
		String searchTerm = prop.getProperty("searchterm");
		return searchTerm;
		
	}
	public String getbrowsername()
	{
		String browsername = prop.getProperty("browser");
		return browsername;
	}
}
