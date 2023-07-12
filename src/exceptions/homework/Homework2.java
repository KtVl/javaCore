package exceptions.homework;

// 1. Напишите метод, на вход которого подаётся двумерный
// строковый массив размером 4х4.
// При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
// 2. Далее метод должен пройтись по всем элементам массива,
// преобразовать в int и просуммировать. Если в каком-то элементе массива преобразование
// не удалось (например, в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//3. В методе main() вызвать полученный метод, обработать возможные исключения
// MyArraySizeException и MyArrayDataException и вывести результат расчета.

public class Homework2 {
    public static void main(String[] args) {
        String[][] wrongArr = new String[4][4];

        try {
            getSumOfElementsFrom(wrongArr);
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }

        String[][] goodArr = {
                {"1", "8", "3", "5"},
                {"1", "2", "1", "4"},
                {"8", "2", "5", "4"},
                {"1", "0", "3", "6"}
        };

        try {
            System.out.println(getSumOfElementsFrom(goodArr));
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }
    }




    public static int getSumOfElementsFrom(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }

            for (int j = 0; j < array[i].length; j++) {
                try {
                    int element = Integer.parseInt(array[i][j]);
                    sum += element;
                } catch (NumberFormatException exception) {
                    throw new MyArrayDataException(i +1, j + 1);
                }
            }
        }

        return sum;
    }
}
