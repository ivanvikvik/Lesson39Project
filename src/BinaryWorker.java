import java.io.*;

public class BinaryWorker {
    public static void write(String fileName) {
        OutputStream stream = null;
        try {
            stream = new BufferedOutputStream(new FileOutputStream(fileName));

            for (int i = -1000; i < 0; i++) {
                stream.write(i);
            }
        } catch (FileNotFoundException exception) {
            System.out.println(exception);
        } catch (IOException exception) {
            System.out.println(exception);
        } finally {
            try {
                if (stream != null) {
                    stream.flush();
                    stream.close();
                }
            } catch (IOException exception) {
                System.out.println(exception);
            }
        }
    }

    public static String read(String fileName) {
        InputStream stream = null;
        StringBuilder builder = new StringBuilder();

        try {
            stream = new BufferedInputStream(new FileInputStream(fileName));

            int number;

            while ((number = stream.read()) != -1) {
                builder.append(number).append(" ");
            }

        } catch (FileNotFoundException exception) {
            System.out.println(exception);
        } catch (IOException exception) {
            System.out.println(exception);
        } finally {
            try {
                if (stream != null) {
                    stream.close();
                }
            } catch (IOException exception) {
                System.out.println(exception);
            }
        }

        return builder.toString();
    }
}
