package com.runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.baseclass.BaseClass;
import com.helper.File_Reader;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ashin\\eclipse-workspace\\GREENKART\\src\\test\\java\\com\\feature\\ordervegetable.feature",
glue="com.stepdefinition",plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")


public class  runnerclass {
	@BeforeClass
	public static void launchbrowser() throws IOException {
		BaseClass.browserLaunch(File_Reader.getInstance().getbrowsername());
	}

}
