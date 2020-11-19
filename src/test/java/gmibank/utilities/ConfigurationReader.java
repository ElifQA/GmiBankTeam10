package gmibank.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    static Properties properties;
    static String path = "/Users/Betul/IdeaProjects/GmiBankTeam10/configuration.properties";
    static {

        try {
            FileInputStream file = new FileInputStream(path);
            properties = new Properties();
            properties.load(file);
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {

        return properties.getProperty(key);
    }

}