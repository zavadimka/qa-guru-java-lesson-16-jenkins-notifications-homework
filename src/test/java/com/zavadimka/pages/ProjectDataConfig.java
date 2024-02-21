package com.zavadimka.pages;

import com.zavadimka.config.ProjectConfig;
import org.aeonbits.owner.ConfigFactory;

import static java.lang.String.format;

public class ProjectDataConfig {

    private final String environment;
    ProjectConfig projectConfig = ConfigFactory.create(ProjectConfig.class);

    public ProjectDataConfig(String environment) {
        this.environment = environment;
    }

    String webUrl = projectConfig.webUrl();
    String apiUrl = projectConfig.apiUrl();
    String apiPort = projectConfig.apiPort();
    String pageAddress = projectConfig.dataPageAddress();
    String firstName = projectConfig.dataFirstName();
    String lastName = projectConfig.dataLastName();
    String email = projectConfig.dataEmail();
    String gender = projectConfig.dataGender();
    String mobileNumber = projectConfig.dataMobileNumber();
    String dayOfBirthday = projectConfig.dataDayOfBirthday();
    String monthOfBirthday = projectConfig.dataMonthOfBirthday();
    String yearOfBirthday = projectConfig.dataYearOfBirthday();
    String subject = projectConfig.dataSubject();
    String hobby = projectConfig.dataHobby();
    String imageName = projectConfig.dataImageName();
    String imagePath = projectConfig.dataImagePath();
    String currentAddress = projectConfig.dataCurrentAddress();
    String state = projectConfig.dataState();
    String city = projectConfig.dataCity();

    public void printProjectConfig() {
        System.out.printf(format("Test environment: %s\nwebUrl: %s\napiUrl: %s\napiPort: %s%n",
                environment, webUrl, apiUrl, apiPort));
    }
}
