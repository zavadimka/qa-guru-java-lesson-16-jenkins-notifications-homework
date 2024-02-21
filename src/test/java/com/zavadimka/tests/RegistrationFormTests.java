package com.zavadimka.tests;

import com.zavadimka.config.BrowserConfig;
import com.zavadimka.pages.ProjectDataConfig;
import com.zavadimka.pages.LambdaSteps;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.IOException;

@Tag("demoqa")
public class RegistrationFormTests extends TestBase {

    @BeforeEach
    void beforeEach() {

        ProjectDataConfig projectDataConfig = createProjectDataConfig();
        BrowserConfig browserConfig = new BrowserConfig();

        System.out.println("The test is run with the following parameters:");
        projectDataConfig.printProjectConfig();
        browserConfig.printBrowserConfig();
    }

    private ProjectDataConfig createProjectDataConfig() {
        String environment = System.getProperty("environment", "stage");

        System.setProperty("environment", environment);
        return new ProjectDataConfig(environment);
    }

    @Test
    @DisplayName("Successful registration test")
    void successfulRegistrationFormFillingTest() throws IOException {

        LambdaSteps steps = new LambdaSteps(createProjectDataConfig());

        steps.fillTheForm();
        steps.verifyRegistrationFormSummaryTable();
        steps.checkBackToTheEmptyRegistrationFormPage();
    }
}
