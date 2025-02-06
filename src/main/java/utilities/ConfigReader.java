package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;


    static {
        try {
            String path = "config.properties";
            FileInputStream stream = new FileInputStream(path);
            properties = new Properties();
            properties.load(stream);


        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }

    public static String getPropertyValue(String key){
        return properties.getProperty(key);
    }




}

