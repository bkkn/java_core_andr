package me.bkkn.lesson10;

import java.util.*;

public class Task {
    /*
    Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
    Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).

    Посчитать, сколько раз встречается каждое слово.

    Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
    В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
    Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
    тогда при запросе такой фамилии должны выводиться все телефоны.
    Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем через консоль и т.д).
    Консоль использовать только для вывода результатов проверки телефонного справочника.
    */

    public static void printOutUniqueWords(String[] words) {
        Set<String> wordsSet = new TreeSet<String>(List.of(words));
        System.out.println(wordsSet);
    }

    public static void countWordFrequencies(String[] words) {
        Map<String, Integer> wordsMap = new HashMap<String, Integer>();
        for (String word : words) {
            Integer count = wordsMap.get(word);
            count = (count == null) ? 1 : ++count;
            wordsMap.put(word, count);
        }
        System.out.println(wordsMap);
    }

    public static class PhoneBook {

        private Map<String, Set<String>> map = new TreeMap<>();

        void add(String name, String number) {
            if (map.containsKey(name)) {
                map.get(name).add(number);
            } else {
                map.put(name, new TreeSet<String>());
                map.get(name).add(number);
            }
        }

        void getNumber(String name) {
            System.out.println(name + " : " + map.get(name));
        }

        public static void test() {
            PhoneBook phoneBook = new PhoneBook();
            phoneBook.add("Ivan", "9011234567");
            phoneBook.add("Ivan", "9021234567");
            phoneBook.add("Ivan", "9031234567");

            phoneBook.add("Ivan2", "9011234567");
            phoneBook.add("Ivan3", "9021234567");
            phoneBook.add("Ivan4", "9031234567");
            phoneBook.getNumber("Ivan");
            phoneBook.getNumber("Ivan1");
            phoneBook.getNumber("Ivan2");
        }
    }
}
