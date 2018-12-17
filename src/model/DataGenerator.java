package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

public class DataGenerator {

    public static int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public static LocalDate createRandomDate(int startYear, int endYear) {
        int day = createRandomIntBetween(1, 28);
        int month = createRandomIntBetween(1, 12);
        int year = createRandomIntBetween(startYear, endYear);
        return LocalDate.of(year, month, day);
    }

    public static ArrayList<Reading> randomReadings(int totalReadings) {

        ArrayList<Reading> readingsList = new ArrayList<>();

        for (int i = 0; i < totalReadings; i++) {
            Random random = new Random();
            int n = random.nextInt(1000) + 1;
            Reading newReading = new Reading(n, "kWh",createRandomDate(2015,2018));
            readingsList.add(newReading);
        }
        return readingsList;
    }
}
