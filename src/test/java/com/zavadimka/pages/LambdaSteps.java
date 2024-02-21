package com.zavadimka.pages;

import static io.qameta.allure.Allure.step;

public class LambdaSteps {
    private final ProjectDataConfig projectDataConfig;

    public LambdaSteps(ProjectDataConfig projectDataConfig) {
        this.projectDataConfig = projectDataConfig;
    }
    RegistrationForm registrationForm = new RegistrationForm();


    public void fillTheForm() {
        step("### Fill the form", () -> {
            registrationForm.openPage(projectDataConfig.pageAddress);
            registrationForm.checkHeader();
            registrationForm.removeBanners();
            registrationForm.setFirstName(projectDataConfig.firstName);
            registrationForm.setLastName(projectDataConfig.lastName);
            registrationForm.setEmail(projectDataConfig.email);
            registrationForm.setGender(projectDataConfig.gender);
            registrationForm.setMobileNumber(projectDataConfig.mobileNumber);
            registrationForm.setDateOfBirth(
                    projectDataConfig.yearOfBirthday,
                    projectDataConfig.monthOfBirthday,
                    projectDataConfig.dayOfBirthday
            );
            registrationForm.setSubject(projectDataConfig.subject);
            registrationForm.setHobby(projectDataConfig.hobby);
            registrationForm.uploadImage(projectDataConfig.imagePath);
            registrationForm.setCurrentAddress(projectDataConfig.currentAddress);
            registrationForm.setState(projectDataConfig.state);
            registrationForm.setCity(projectDataConfig.city);
            registrationForm.scrollScreenDown();
            registrationForm.submitRegistration();
        });
    }

    public void verifyRegistrationFormSummaryTable() {
        step("### Verify the registration form summary table", () -> {
            registrationForm.checkSummaryTableOpening();
            registrationForm.nameVerification(projectDataConfig.firstName, projectDataConfig.lastName);
            registrationForm.summaryTableVerification("Student Email", projectDataConfig.email);
            registrationForm.summaryTableVerification("Gender", projectDataConfig.gender);
            registrationForm.summaryTableVerification("Mobile", projectDataConfig.mobileNumber);
            registrationForm.dateOfBirthVerification(
                    projectDataConfig.yearOfBirthday,
                    projectDataConfig.monthOfBirthday,
                    projectDataConfig.dayOfBirthday
            );
            registrationForm.summaryTableVerification("Subjects", projectDataConfig.subject);
            registrationForm.summaryTableVerification("Hobbies", projectDataConfig.hobby);
            registrationForm.summaryTableVerification("Picture", projectDataConfig.imageName);
            registrationForm.summaryTableVerification("Address", projectDataConfig.currentAddress);
            registrationForm.stateAndCityVerification(projectDataConfig.state, projectDataConfig.city);
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
