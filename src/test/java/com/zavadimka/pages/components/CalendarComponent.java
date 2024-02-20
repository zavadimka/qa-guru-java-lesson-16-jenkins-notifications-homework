package com.zavadimka.pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setDate(String yearOfBirthday, String monthOfBirthday, String dayOfBirthday) {
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").scrollTo().selectOptionByValue(yearOfBirthday);
        $(".react-datepicker__year-select").selectOptionByValue(yearOfBirthday);
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption(monthOfBirthday);
        $(".react-datepicker__day--0" + dayOfBirthday + ":not(.react-datepicker__day--outside-month)").click();
    }
}
