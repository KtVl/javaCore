package exceptions;

public class EmptyFoodInPlate extends RuntimeException{ //наследуется от класса исключений
    @Override
    public String getMessage() {
        return "Еды в тарелке нет!";
    }
}
