package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.components.CalendarComponent;
import pages.components.ResultTableComponent;
import pages.components.UploadFileComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormPage {
    CalendarComponent calendarComponent = new CalendarComponent();
    ResultTableComponent resultTableComponent = new ResultTableComponent();
    UploadFileComponent uploadFileComponent = new UploadFileComponent();
    SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            genderRadioButton = $("#genterWrapper"),
            dateOfBirthInput = $("#dateOfBirthInput"),
            numberInput = $("#userNumber"),
            subjectInput = $("#subjectsInput"),
            hobbiesInput = $("#hobbiesWrapper"),
            addressInput = $("#currentAddress"),
            stateField = $("#state"),
            stateInput = $("#stateCity-wrapper"),
            cityFild = $("#city"),
            cityFildInput = $("#stateCity-wrapper"),
            submitPress = $("#submit"),
            closePress = $("#closeLargeModal");



    @Step("Открываемм страницу")
    public RegistrationFormPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        return this;
    }

    @Step("Вводим имя")
    public RegistrationFormPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    @Step("Вводим фамилию")
    public RegistrationFormPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    @Step("Вводим почту")
    public RegistrationFormPage setEmail(String value) {
        emailInput.setValue(value);
        return this;
    }

    @Step("Выбираем пол")
    public RegistrationFormPage setGender(String value) {
        genderRadioButton.$(byText(value)).click();
        return this;
    }

    @Step("Вводим номер")
    public RegistrationFormPage setNumber(String value) {
        numberInput.setValue(value);
        return this;
    }

    @Step("Вводим ДР")
    public RegistrationFormPage setDateOfBirth(String day, String month, String year) {
        dateOfBirthInput.click();
        calendarComponent.setDate(day, month, year);
        return this;
    }

    @Step("Выбираем предмет")
    public RegistrationFormPage setSubjects(String value) {
        subjectInput.sendKeys(value);
        subjectInput.pressEnter();
        return this;
    }

    @Step("Выбираем хобби")
    public RegistrationFormPage setHobbies(String value) {
        hobbiesInput.$(byText(value)).click();
        return this;
    }

    @Step("Загружаем изображение")
    public RegistrationFormPage uploadPicture(String value) {
        uploadFileComponent.uploadPicture(value);
        return this;
    }

    @Step("Вводим адрес")
    public RegistrationFormPage setAddress(String value) {
        addressInput.setValue(value);
        return this;
    }

    @Step("Выбираем штат")
    public RegistrationFormPage setState(String value) {
        stateField.click();
        stateInput.$(byText(value)).click();
        return this;
    }

    @Step("Выбираем город")
    public RegistrationFormPage setCity(String value) {
        cityFild.click();
        cityFildInput.$(byText(value)).click();
        return this;
    }

    @Step("Нажимаем подтвердить")
    public RegistrationFormPage pressSubmit() {
        submitPress.click();
        return this;
    }

    @Step("Проверяем таблицу")
    public RegistrationFormPage checkResult(String key, String value) {
        resultTableComponent.checkResult(key, value);
        return this;
    }

    @Step("Проверяем заголовок")
    public RegistrationFormPage checkTitleResult() {
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        return this;
    }

    @Step("Закрываем таблицу")
    public RegistrationFormPage pressClose() {
        closePress.click();
        return this;
    }
}