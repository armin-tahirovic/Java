import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Domain {

    public static void main(String args[]) {
        Meter meter = new Meter(new ArrayList<>(), "heat", 555);
        LocalDate today = LocalDate.now();
        meter.addReading(1000, "flow", today);
        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            int n = random.nextInt(100) + 1;
            meter.addReading(n, "flow", today);

        }
        String output = meter.generateOutput();
        System.out.println(output);

        whenWriteStringUsingBufferedWritter_thenCorrect("C:/Users/oscar/IdeaProjects/Projekt Energimåler/src/Text", output);
    }


    public static void whenWriteStringUsingBufferedWritter_thenCorrect(String fileName, String str) {


        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(str);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

