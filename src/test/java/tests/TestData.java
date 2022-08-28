package tests;

import com.github.javafaker.Faker;

import java.util.Locale;

import static utils.RandomUtilities.*;

public class TestData {

    private static final String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };
    private static final String[] genders = {
            "Male", "Female", "Other"
    };
    private static final String[] hobby = {
            "Sports", "Reading", "Music"
    };
    private static final String[] state = {
            "NCR", "Uttar Pradesh", "Haryana", "Rajasthan"
    };
    private static final String[] subject = {
            "Hindi", "English", "Maths", "Physics", "Chemistry", "Biology",
            "Biology", "Computer Science", "Commerce", "Accounting", "Economics",
            "Arts", "Social Studies", "History", "Civics"
    };
    public static final String[] cityNCR = new String[]{
            "Delhi", "Gurgaon", "Noida"
    };
    public static final String[] cityUttarPradesh = new String[]{
            "Agra", "Lucknow", "Merrut"
    };
    public static final String[] cityHaryana = new String[]{
            "Karnal", "Panipat"
    };
    public static final String[] cityRajasthan = new String[]{
            "Jaipur", "Jaiselmer"
    };

    private static Faker faker = new Faker(new Locale("ru"));

    public static final String FIRSTNAME = faker.name().firstName();
    public static final String LASTNAME = faker.name().lastName();
    public static final String EMAIL = faker.internet().emailAddress("en");
    public static final String GENDER = generateRandomValuesFromArray(genders);
    public static final String NUMBER = faker.numerify("##########");
    public static final String DAY = checkDay(getRandomInt(1, 28));
    public static final String MONTH = generateRandomValuesFromArray(months);
    public static final String YEAR = Integer.toString(getRandomInt(1900, 2100));
    public static final String SUBJECT = generateRandomValuesFromArray(subject);
    public static final String HOBBY = generateRandomValuesFromArray(hobby);
    public static final String ADDRESS = faker.address().fullAddress();
    public static final String FILE = "summer.jpeg";
    public static final String STATE = generateRandomValuesFromArray(state);
    public static final String CITY = generateRandomCity(STATE);

}