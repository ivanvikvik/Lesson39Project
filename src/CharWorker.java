import java.io.*;

public class CharWorker {
    public static void write(String filaName) {
        // Writer stream = null;

        try (Writer writer = new FileWriter(filaName);
             BufferedWriter stream = new BufferedWriter(writer)) {

            for (int i = 0; i < 130; i++) {
                stream.write(i);
            }

//            if (stream != null) {
//                stream.flush();
//            }

        } catch (IOException exception) {
            System.out.println(exception);
        }
    }

    public static String read(String filaName) {
        // Writer stream = null;
        StringBuilder builder = new StringBuilder();

        try (Reader reader = new FileReader(filaName);
             BufferedReader stream = new BufferedReader(reader)) {

            int number;
            while ((number = stream.read()) != -1) {
                builder.append((char) number).append(" ");
            }

//            if (stream != null) {
//                stream.flush();
//            }

        } catch (IOException exception) {
            System.out.println(exception);
        }

        return builder.toString();
    }
}
