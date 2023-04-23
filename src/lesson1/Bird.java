package lesson1;

public class Bird extends Animal {
    int height;

    public Bird(String newName, String newColor, int newAge, int height) {
        super(newAge, newName, newColor);
        this.height = height;
    }

    public void voice() {
        System.out.println(name + " чирик");
    }

    //отдать объект клон
    public Bird getClone() throws CloneNotSupportedException { //ключ слово throws знач данный метод может иметь исключ
        return (Bird) this.clone();//вместо обр исключ здесь обрат его в любом др месте вызыв этот метод
    }
}
