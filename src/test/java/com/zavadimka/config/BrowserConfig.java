package com.zavadimka.config;

import org.aeonbits.owner.ConfigFactory;

public class BrowserConfig {

    DriverConfig driverConfig = ConfigFactory.create(DriverConfig.class);
    String browserName = driverConfig.browserName();
    String browserVersion = driverConfig.browserVersion();
    String browserSize = driverConfig.browserSize();

    public void printBrowserConfig(){
        System.out.printf("Browser: %s\nVersion: %s\nWindow size: %s%n",
                browserName, browserVersion, browserSize);
    }
}
