package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lesson3 {
    public static void main(String[] args) {
        ArrayList<String> listOfStrings = new ArrayList<>();
        ArrayList<Integer> listOfInteger = new ArrayList<>();

        listOfInteger.add(1);
        listOfInteger.add(2);
        listOfInteger.add(3);
        System.out.println(listOfInteger);

        listOfInteger.add(1,100);                  //на первый элемент добавить 100

        System.out.println("-----------");

        for (int i = 0; i < listOfInteger.size(); i++) {
            System.out.println(listOfInteger.get(i));
        }

        System.out.println("-----------");

        for (Integer integer: listOfInteger) {
            System.out.println(integer);
        }

        System.out.println("------");

        listOfInteger.remove(1);                           //удалить с индексом 1
        for (Integer integer : listOfInteger) {
            System.out.println(integer);
        }

        Integer[] integers = new Integer[listOfInteger.size()]; //передаем в массив коллекцию
        listOfInteger.toArray(integers);                        // преобразуем в обычный массив
        doSomethingWith(integers);                              // вызывваем метод, кот на вход принимает массив

        System.out.println("-----------");

        HashMap<Integer, String> hm = new HashMap<>();         // создали объект где ключ инт и знач стринг
        hm.put(1, "qwerty");                                   // положили ключ значение
        hm.put(245, "asdfg");
        //System.out.println(hm.get(1));
        // вывести значения которые присвоили
        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


    }
    public static void doSomethingWith (Integer[] integers) {
        System.out.println("do smth with");
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
