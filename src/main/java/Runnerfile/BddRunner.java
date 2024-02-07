package Runnerfile;

import org.testng.annotations.AfterClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"fea"},
                 glue =     {"Stepdefination"},
                 plugin =    { "pretty",
    		     "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                 monochrome = true )
public class BddRunner extends AbstractTestNGCucumberTests{
	
	}