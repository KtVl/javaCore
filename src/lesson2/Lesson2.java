package lesson2;
import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {

        Water water = new Water();
        Cup<Water> waterCup = new Cup(water);

        Tea tea = new Tea();
        Cup<Tea> teaCup = new Cup(tea);

        System.out.println(teaCup.getLiquid().getClass().getSimpleName());
        System.out.println(waterCup.getLiquid().getClass().getSimpleName());


        Meat meat = new Meat();
        Vegetables vegetables = new Vegetables();

        Plate<Meat, Vegetables> plate = new Plate(meat, vegetables);
        plate.showTypes();

        System.out.println("-------------------------");

        String[] strings = {"1", "2"};
        System.out.println(Arrays.toString(strings));
        changeArrayElements(strings, 0, 1);
        System.out.println(Arrays.toString(strings));
    }

    // метод, меняющий местами данные
    public static <T> void changeArrayElements(T[] array, int firstIndex, int secondIndex) {
        T arrayElement = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = arrayElement;
    }
}
