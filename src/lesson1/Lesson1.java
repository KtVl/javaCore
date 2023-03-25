package lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        Cat firstCat = new Cat("Мышкин", "Белый", 5);
        Dog firstDog = new Dog("Бобик", "Черный", 10);
        Bird firstBird = new Bird("Чижик", "Желтый", 2, 5);
        Parrot firstParrot = new Parrot("Полли", "Радужный", 1, 3);
        Snake firstSnake = new Snake(8, "Нагайна", "Пятнистая");

        callVoice(firstCat);
        callVoice(firstDog);
        callVoice(firstBird);
        callVoice(firstParrot);
        callVoice(firstSnake);

        Car firstCar = new Car();

        callMove(firstCar);
        callMove(firstParrot);
        callMove(firstCat);

        Fruits fruit = Fruits.orange;

        switch (fruit) {
            case apple:
                System.out.println("Яблоко");
                break;
            case orange:
                System.out.println("Апельсин");
                break;
        }
    }

    public static void callVoice(Animal animal) {
        animal.voice();
    }

    public static void callMove(Movable movable) {
        movable.move();
    }
}

