package example.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ApplicationPropertiesExample {

    public void getProperties() throws IOException {

        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String appConfigPath = rootPath + "application.properties";
        String anyNameConfigPath = rootPath + "anyname.properties";

        Properties appProps = new Properties();
        appProps.load(new FileInputStream(appConfigPath));

        String appVersion = appProps.getProperty("versions");

        appProps.setProperty("name", "NewAppName"); // update an old value
        appProps.setProperty("newName", "New Name"); // add new key-value pair

        appProps.remove("version");
    }
}
