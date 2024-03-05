package com.zavadimka.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/driver.properties"
})
public interface DriverConfig extends Config{

    @Key("browser.name")
    @DefaultValue("some_browser")
    String browserName();

    @Key("browser.version")
    @DefaultValue("latest_version")
    String browserVersion();

    @Key("browser.size")
    @DefaultValue("some_window_size")
    String browserSize();

}