import exceptions.lesson.Cat;
import exceptions.lesson.EmptyFoodInPlate;
import exceptions.lesson.Plate;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мышкин", "Белый", 10);
        Plate plate = new Plate(10);
        cat.appetite = 20;

        try {
            cat.eat(plate);
        } catch (EmptyFoodInPlate emptyFoodInPlate) {
            System.out.println(emptyFoodInPlate.getMessage());
        }
    }
}
