package tests;

import static io.qameta.allure.Allure.step;

public class LambdaSteps {
    RegistrationForm registrationForm = new RegistrationForm();
    InputData inputData = new InputData();

    public void fillTheForm(){
        step("### Fill the form", () -> {
            registrationForm.openPage(inputData.pageAddress);
            registrationForm.checkHeader();
            registrationForm.removeBanners();
            registrationForm.setFirstName(inputData.firstName);
            registrationForm.setLastName(inputData.lastName);
            registrationForm.setEmail(inputData.email);
            registrationForm.setGender(inputData.gender);
            registrationForm.setMobileNumber(inputData.mobileNumber);
            registrationForm.setDateOfBirth(inputData.yearOfBirthday, inputData.monthOfBirthday, inputData.dayOfBirthday);
            registrationForm.setSubject(inputData.subject);
            registrationForm.setHobby(inputData.hobby);
            registrationForm.uploadImage(inputData.imagePath);
            registrationForm.setCurrentAddress(inputData.currentAddress);
            registrationForm.setState(inputData.state);
            registrationForm.setCity(inputData.city);
            registrationForm.scrollScreenDown();
            registrationForm.submitRegistration();
        });
    }

    public void verifyRegistrationFormSummaryTable() {
        step("### Verify the registration form summary table", () -> {
            registrationForm.checkSummaryTableOpening();
            registrationForm.nameVerification(inputData.firstName, inputData.lastName);
            registrationForm.summaryTableVerification("Student Email", inputData.email);
            registrationForm.summaryTableVerification("Gender", inputData.gender);
            registrationForm.summaryTableVerification("Mobile", inputData.mobileNumber);
            registrationForm.dateOfBirthVerification(inputData.yearOfBirthday, inputData.monthOfBirthday, inputData.dayOfBirthday);
            registrationForm.summaryTableVerification("Subjects", inputData.subject);
            registrationForm.summaryTableVerification("Hobbies", inputData.hobby);
            registrationForm.summaryTableVerification("Picture", inputData.imageName);
            registrationForm.summaryTableVerification("Address", inputData.currentAddress);
            registrationForm.stateAndCityVerification(inputData.state, inputData.city);
            registrationForm.closeSummaryTable();
        });
    }

    public void checkBackToTheEmptyRegistrationFormPage() {
        step("### Check back to the empty registration form page", () -> {
            registrationForm.checkHeader();
            registrationForm.checkEmptyFirstName();
        });
    }
}
