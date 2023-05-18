package inputoutput;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class OutputStream {
    public static void main(String[] args) {


        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Hello.txt");
            byte[] dataByte = "Hello world".getBytes(StandardCharsets.UTF_8); // конвертируем текст в набор байтов
            fileOutputStream.write(dataByte);                                 // записывает в файл
            fileOutputStream.close();
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        // или записать проще
        try (FileOutputStream fileOutputStream = new FileOutputStream("bye.txt", true)) {
            byte[] dataByte = " bye bye bye ".getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(dataByte);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
