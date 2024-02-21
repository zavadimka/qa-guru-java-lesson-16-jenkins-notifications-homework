package com.zavadimka.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/${environment}.properties")
public interface ProjectConfig extends Config {

    @Key("web.url")
    String webUrl();

    @Key("api.url")
    String apiUrl();

    @Key("api.port")
    String apiPort();

    @Key("data.pageAddress")
    String dataPageAddress();

    @Key("data.firstName")
    String dataFirstName();

    @Key("data.lastName")
    String dataLastName();

    @Key("data.email")
    String dataEmail();

    @Key("data.gender")
    String dataGender();

    @Key("data.mobileNumber")
    String dataMobileNumber();

    @Key("data.dayOfBirthday")
    String dataDayOfBirthday();

    @Key("data.monthOfBirthday")
    String dataMonthOfBirthday();

    @Key("data.yearOfBirthday")
    String dataYearOfBirthday();

    @Key("data.subject")
    String dataSubject();

    @Key("data.hobby")
    String dataHobby();

    @Key("data.imageName")
    String dataImageName();

    @Key("data.imagePath")
    String dataImagePath();

    @Key("data.currentAddress")
    String dataCurrentAddress();

    @Key("data.state")
    String dataState();

    @Key("data.city")
    String dataCity();
}
