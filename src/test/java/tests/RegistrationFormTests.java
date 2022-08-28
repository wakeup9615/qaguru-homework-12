package tests;

import org.junit.jupiter.api.Test;

import static tests.TestData.*;

public class RegistrationFormTests extends TestBase {
    @Test
    void successfulTest() {

        registrationFormPage.openPage()
                .setFirstName(FIRSTNAME)
                .setLastName(LASTNAME)
                .setEmail(EMAIL)
                .setGender(GENDER)
                .setNumber(NUMBER)
                .setDateOfBirth(DAY, MONTH, YEAR)
                .setSubjects(SUBJECT)
                .setHobbies(HOBBY)
                .uploadPicture("img/" + FILE)
                .setAddress(ADDRESS)
                .setState(STATE)
                .setCity(CITY)
                .pressSubmit()
                .checkTitleResult()
                .checkResult("Student Name", FIRSTNAME + " " + LASTNAME)
                .checkResult("Student Email", EMAIL)
                .checkResult("Gender", GENDER)
                .checkResult("Mobile", NUMBER)
                .checkResult("Date of Birth", DAY + " " + MONTH + "," + YEAR)
                .checkResult("Subjects", SUBJECT)
                .checkResult("Hobbies", HOBBY)
                .checkResult("Picture", FILE)
                .checkResult("Address", ADDRESS)
                .checkResult("State and City", STATE + " " + CITY)
                .pressClose();
    }
}