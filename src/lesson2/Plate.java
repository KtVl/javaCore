package lesson2;

public class Plate<T extends Meat, S extends Vegetables> {
    private T firstPart;
    private S secondPart;

    public Plate(T firstPart, S secondPart) {
        this.firstPart = firstPart;
        this.secondPart = secondPart;
    }

    // метод печатает что хранится в тарелке
    public void showTypes() {
        System.out.println(firstPart.getClass().getSimpleName());
        System.out.println(secondPart.getClass().getSimpleName());
    }
}
