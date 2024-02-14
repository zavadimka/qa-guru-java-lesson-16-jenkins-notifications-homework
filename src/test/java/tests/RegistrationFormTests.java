package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.IOException;

@Tag("demoqa")
public class RegistrationFormTests extends TestBase {

    @Test
    @DisplayName("Successful registration test")
    void successfulRegistrationFormFillingTest() throws IOException {

        LambdaSteps steps = new LambdaSteps();

        steps.fillTheForm();
        steps.verifyRegistrationFormSummaryTable();
        steps.checkBackToTheEmptyRegistrationFormPage();
    }
}
