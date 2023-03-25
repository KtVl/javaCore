package lesson1;

public class Cat extends Animal {
    public int appetite;

    public Cat(String newName, String newColor, int newAge) {
        super(newAge, newName, newColor);
    }

    public void voice() {
        System.out.println(name + " мяу");
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
    }
}
