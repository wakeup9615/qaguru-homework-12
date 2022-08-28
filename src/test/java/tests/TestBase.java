package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.CredentialsConfig;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.RegistrationFormPage;

public class TestBase {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    static CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class);

    @BeforeAll
    static void beforeAll() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);

        Configuration.browserCapabilities = capabilities;
        Configuration.baseUrl = System.getProperty("baseUrl");
        Configuration.browser = System.getProperty("browser");
        Configuration.browserVersion = System.getProperty("browserVersion");
        Configuration.browserSize = System.getProperty("browserSize");
        String urlSelenoid = System.getProperty("urlSelenoid");
        String login = config.login();
        String password = config.password();
        Configuration.remote = String.format("https://%s:%s@%s", login, password, urlSelenoid);
        //gradle clean test -DbaseUrl=https://demoqa.com -Dbrowser=chrome -DbrowserVersion=100.0 -DbrowserSize=1920x1080 -DurlSelenoid=selenoid.autotests.cloud/wd/hub
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource(); //исходный код страницы
        Attach.browserConsoleLogs(); //лог консоли
        Attach.addVideo();
    }
}