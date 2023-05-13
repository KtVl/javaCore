package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Написать простой класс «Телефонный Справочник»,
который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи,
а с помощью метода get() искать номер телефона по фамилии.
Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны.
*/
public class PhoneBook {

        private final HashMap<String, String> phoneToName; // Словарь телефон-фамилия. Телефоны - ключ, фам-знач


        public PhoneBook() {
            phoneToName = new HashMap<>();
        }

        // добавлять записи
        public void add(String phone, String name) {
            phoneToName.put(phone, name);
        }

        // распечатать все значения
        public void print() {
            for (Map.Entry<String, String> entry : phoneToName.entrySet()) {
                System.out.print(entry.getValue() + " : " + entry.getKey() +  "\n");
            }
        }

        // искать номер телефона по фамилии.
        public ArrayList<String> getPhonesBy(String name) {
            ArrayList<String> result = new ArrayList<>();

            for (Map.Entry<String, String> phoneEntry : phoneToName.entrySet()) {
                if (phoneEntry.getValue().equals(name)) {
                    result.add(phoneEntry.getKey());
                }
            }
            return result;
        }
    }

