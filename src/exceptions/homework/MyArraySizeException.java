package exceptions.homework;

public class MyArraySizeException extends Exception {
    @Override
    public String getMessage() {
        return "массив неверного размера";
    }
}
