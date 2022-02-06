package com.onesuite.rough;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Testproperties {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println(System.getProperty("user.dir"));
		Properties config = new Properties ();
		//For OR properties file
		Properties OR = new Properties ();
		FileInputStream Fis = new FileInputStream(System.getProperty("user.dir") +"\\src\\test\\resources\\Properties\\Config.properties"); 
		config.load(Fis);
		//For OR properties file
		 Fis = new FileInputStream(System.getProperty("user.dir") +"\\src\\test\\resources\\Properties\\OR.properties"); 
		//For OR properties file
	    OR.load(Fis);
		System.out.println(config.getProperty("browser"));
		//For OR properties file
		System.out.println(OR.getProperty("Loginbtn"));
	}

}
