package utils;

import java.io.*;
import java.util.Properties;

public class PropertyFiles {
    public Properties properties;

    public String propertyName(String nameofProperty) throws IOException {
        properties=new Properties();
        InputStream inputStream=new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\ConfigFiles\\global.properties"));
        properties.load(inputStream);
        return properties.getProperty(nameofProperty);
    }
}
