package model;
import java.io.*;
import java.util.Comparator;

public class DataFileGenerator {
    public static void generateFile() {
        Meter meter1 = new Meter(1, true);
        meter1.setReadings(DataGenerator.randomReadings(1090));
        meter1.getReadings().sort(Comparator.comparing(Reading::getDate));

        String output = meter1.generateOutput();
        whenWriteStringUsingBufferedWritter_thenCorrect("src/Meter1", output);

        Meter meter2 = new Meter(2, true);
        meter2.setReadings(DataGenerator.randomReadings(1090));
        meter2.getReadings().sort(Comparator.comparing(Reading::getDate));

        String output2 = meter2.generateOutput();
        whenWriteStringUsingBufferedWritter_thenCorrect("src/Meter2", output2);

        Meter meter3 = new Meter(3, true);
        meter3.setReadings(DataGenerator.randomReadings(1090));
        meter3.getReadings().sort(Comparator.comparing(Reading::getDate));

        String output3 = meter3.generateOutput();
        whenWriteStringUsingBufferedWritter_thenCorrect("src/Meter3", output3);
    }
    public static void whenWriteStringUsingBufferedWritter_thenCorrect(String fileName, String str) {


        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new java.io.FileWriter(fileName));
            writer.write(str);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
