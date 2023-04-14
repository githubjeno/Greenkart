package com.helper;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class File_Reader {

	public static WebDriver driver;
	public static Configure_Reader getInstance() throws IOException {
		Configure_Reader cf = new Configure_Reader();
		return cf;
	}
}
