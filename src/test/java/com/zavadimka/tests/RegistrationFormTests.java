package com.zavadimka.tests;

import com.zavadimka.config.BrowserConfig;
import com.zavadimka.pages.LambdaSteps;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.IOException;

@Tag("demoqa")
public class RegistrationFormTests extends TestBase {

    @BeforeEach
    void beforeEach(){
        BrowserConfig browserConfig = new BrowserConfig();

        System.out.println("The test is run with the following parameters:");
        browserConfig.printBrowserConfig();
    }

    @Test
    @DisplayName("Successful registration test")
    void successfulRegistrationFormFillingTest() throws IOException {

        LambdaSteps steps = new LambdaSteps();

        steps.fillTheForm();
        steps.verifyRegistrationFormSummaryTable();
        steps.checkBackToTheEmptyRegistrationFormPage();
    }
}
