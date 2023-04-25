package lesson2;
/*
E — элемент (Element, обширно используется Java Collections Framework)
K — Ключ
N — Число
T — Тип
V — Значение
S, U, V и т. п. — 2-й, 3-й, 4-й типы
*/
public class Cup<T extends Liquid> { // можно складывать в чашку только жидкость(Liquid)
    private T liquid;

    public Cup(T liquid) {
        this.liquid = liquid;
    }

    public T getLiquid() {
        return liquid;
    }
}
