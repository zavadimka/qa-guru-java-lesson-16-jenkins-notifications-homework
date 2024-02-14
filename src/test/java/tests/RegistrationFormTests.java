package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static io.qameta.allure.Allure.step;

@Tag("demoqa")
public class RegistrationFormTests extends TestBase {

    @Test
    @DisplayName("Successful registration test")
    void successfulRegistrationFormFillingTest() throws IOException {

        RegistrationForm registrationForm = new RegistrationForm();

        String pageAddress = "/automation-practice-form",
                firstName = "Ivan",
                lastName = "Ivanov",
                email = "ivanov@ivanov.com",
                gender = "Male",
                mobileNumber = "0123456789",
                dayOfBirthday = "02",
                monthOfBirthday = "June",
                yearOfBirthday = "1985",
                subject = "Maths",
                hobby = "Sports",
                imageName = "testImage.png",
                imagePath = "testData/img/testImage.png",
                currentAddress = "Montenegro",
                state = "NCR",
                city = "Delhi";


        step("### Fill the form", () -> {
            registrationForm.openPage(pageAddress);
            registrationForm.checkHeader();
            registrationForm.removeBanners();
            registrationForm.setFirstName(firstName);
            registrationForm.setLastName(lastName);
            registrationForm.setEmail(email);
            registrationForm.setGender(gender);
            registrationForm.setMobileNumber(mobileNumber);
            registrationForm.setDateOfBirth(yearOfBirthday, monthOfBirthday, dayOfBirthday);
            registrationForm.setSubject(subject);
            registrationForm.setHobby(hobby);
            registrationForm.uploadImage(imagePath);
            registrationForm.setCurrentAddress(currentAddress);
            registrationForm.setState(state);
            registrationForm.setCity(city);
            registrationForm.scrollScreenDown();
            registrationForm.submitRegistration();
        });

        step("### Verify the registration form summary table", () -> {
            registrationForm.checkSummaryTableOpening();
            registrationForm.nameVerification(firstName, lastName);
            registrationForm.summaryTableVerification("Student Email", email);
            registrationForm.summaryTableVerification("Gender", gender);
            registrationForm.summaryTableVerification("Mobile", mobileNumber);
            registrationForm.dateOfBirthVerification(yearOfBirthday, monthOfBirthday, dayOfBirthday);
            registrationForm.summaryTableVerification("Subjects", subject);
            registrationForm.summaryTableVerification("Hobbies", hobby);
            registrationForm.summaryTableVerification("Picture", imageName);
            registrationForm.summaryTableVerification("Address", currentAddress);
            registrationForm.stateAndCityVerification(state, city);
            registrationForm.closeSummaryTable();
        });

        step("### Check back to the empty registration form page", () -> {
            registrationForm.checkHeader();
            registrationForm.checkEmptyFirstName();
        });
    }
}
