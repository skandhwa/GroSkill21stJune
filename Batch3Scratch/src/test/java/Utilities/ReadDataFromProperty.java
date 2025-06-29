package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import Constants.Constants1;

public class ReadDataFromProperty {
	
	
	public static  Properties readDataFromProperty() throws IOException
	{
	
	
		FileReader reader=new FileReader(Constants1.PROPERTYFILEPATH);
		Properties prop=new Properties();
		prop.load(reader);
		return prop;
	
		
	
	
	}
	

}
