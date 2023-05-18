package inputoutput;

import java.io.FileInputStream;
import java.util.ArrayList;

public class InputStream {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("bye.txt")) {
            byte[] bytes = new byte[fileInputStream.available()]; //создаем байтовый файл. массив с размерностью авейлбл
            fileInputStream.read(bytes);                          // в массив байтс запишет набор данных
            System.out.println(new String(bytes));                // конвертируем массив в строку для вывода
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        // второй способ если поток не к файлу, а к  удаленному серверу

        try (FileInputStream fileInputStream = new FileInputStream("bye.txt")) {
            ArrayList<Byte> newData = new ArrayList<>();

            final int EOF = -1;
            int temp = 0;

            while ((temp = fileInputStream.read()) != EOF) {
                newData.add((byte) temp);
            }

            byte[] bytes = convertToBytes(newData);
            System.out.println(new String(bytes));

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static byte[] convertToBytes(ArrayList<Byte> list) {
        byte[] array = new byte[list.size()];

        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
