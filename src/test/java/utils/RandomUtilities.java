package utils;

import java.util.Random;

import static tests.TestData.*;

public class RandomUtilities {

    public static String generateRandomValuesFromArray(String[] arr) {
        int n = (int) Math.floor(Math.random() * arr.length);
        return arr[n];
    }

    public static String checkDay(int day) {
        if (day < 10) {
            return "0" + day;
        }
        return Integer.toString(day);
    }

    public static int getRandomInt(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static String generateRandomCity(String state) {
        String city = null;
        switch (state) {
            case "NCR": {
                city = generateRandomValuesFromArray(cityNCR);
                return city;
            }
            case "Uttar Pradesh": {
                city = generateRandomValuesFromArray(cityUttarPradesh);
                return city;
            }
            case "Haryana": {
                city = generateRandomValuesFromArray(cityHaryana);
                return city;
            }
            case "Rajasthan": {
                city = generateRandomValuesFromArray(cityRajasthan);
                return city;
            }
        }
        return null;
    }
}
