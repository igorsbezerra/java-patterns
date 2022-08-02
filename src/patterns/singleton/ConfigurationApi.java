package patterns.singleton;

import java.util.Objects;

public class ConfigurationApi {

    private static ConfigurationApi instance;

    private ConfigurationApi() {
    }

    public static ConfigurationApi getInstance() {
        synchronized (ConfigurationApi.class) {
            if (Objects.isNull(instance)) {
                instance = new ConfigurationApi();
            }
        }
        return instance;
    }
}
