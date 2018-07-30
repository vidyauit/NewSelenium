package com.actitimeproject.genericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtils {
public Properties prop;
public Properties readDatafromProperty() throws IOException{
	
	FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
prop=new Properties();
prop.load(fis);
return prop;

}
}
