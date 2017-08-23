package hu.wade.klayton.configclientapp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Walter Krix <wkrix89@gmail.com>
 */
@Component
@ConfigurationProperties(prefix = "some")
public class ConfigClientAppConfiguration {

    private String property;

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}
