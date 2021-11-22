package com.makhabatusen;

import com.sun.tools.javac.util.List;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        String space = "_______";

        // 1

        ArrayList<String> countries = new ArrayList<>(List.of("Germany", "Kyrgyzstan", "Australia", "Germany", "Great Britain"));
        System.out.println(setOfList(countries));
        System.out.println(space);

        // 2

        HashMap<String, String> veggiesNFruits = new HashMap<>();
        veggiesNFruits.put("арбуз", "ягода");
        veggiesNFruits.put("банан", "трава");
        veggiesNFruits.put("вишня", "ягода");
        veggiesNFruits.put("груша", "фрукт");
        veggiesNFruits.put("дыня", "овощ");
        veggiesNFruits.put("ежевика", "куст");
        veggiesNFruits.put("жень-шень", "корень");
        veggiesNFruits.put("земляника", "ягода");
        veggiesNFruits.put("ирис", "цветок");
        veggiesNFruits.put("картофель", "клубень");
        hashmap(veggiesNFruits);
        System.out.println(space);


        // 3
        ArrayList<Cat> cats = new ArrayList<>(List.of(
                new Cat("Masya", 2),
                new Cat("Mango", 4),
                new Cat("Borsik", 3),
                new Cat("Kuzya", 7),
                new Cat("Knopka", 5),
                new Cat("Zorro", 2),
                new Cat("Tom", 3),
                new Cat("Pushik", 4),
                new Cat("Leo", 1),
                new Cat("Atos", 6)));

        HashMap<String, Cat> catsHashmap = new HashMap<>();
        for (Cat cat : cats) {
            catsHashmap.put(cat.getName(), cat);
        }
        cats(catsHashmap);
        System.out.println(space);


        // 4
        ArrayList<String> strings = new ArrayList<>(List.of(
                "lady", "lamp", "love", "lace", "led", "light", "lab", "limit", "label", "laboratory",
                "labyrinth", "lactose", "line", "lexi", "logo", "logarithm", "lion", "lux", "law", "land"));
        setOfStrings(strings);
        System.out.println(space);

        // 5

        ArrayList<Integer> integers = new ArrayList<>(List.of(
                1, 4, 2, 5, 6, 7, 8, 9, 12, 22,
                56, 77, 11, 10, 3, 80, 5, 23, 90, 14
        ));
        setOfIntegers(integers);

        System.out.println(space);


        // 6
        Map<String, LocalDate> birthdateMap = new HashMap<>();
        birthdateMap.put("Bill", LocalDate.of(1978, 12, 1));
        birthdateMap.put("Leila", LocalDate.of(1986, 1, 12));
        birthdateMap.put("Janet", LocalDate.of(1998, 2, 21));
        birthdateMap.put("Jack", LocalDate.of(2001, 7, 15));
        birthdateMap.put("Jasper", LocalDate.of(1968, 9, 23));
        birthdateMap.put("Kate", LocalDate.of(1955, 8, 4));
        birthdateMap.put("Naomi", LocalDate.of(1989, 11, 7));
        birthdateMap.put("Mila", LocalDate.of(2002, 12, 9));
        birthdateMap.put("Molly", LocalDate.of(2015, 5, 30));
        birthdateMap.put("Robert", LocalDate.of(2019, 6, 6));

        hashmapBirthdate(birthdateMap);

    }


    //Task 1
    private static Set<String> setOfList(ArrayList<String> countries) {
        return new HashSet<>(countries);
    }

    //Task 2
    private static void hashmap(HashMap<String, String> hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }


    // Task 3
    private static void cats(HashMap<String, Cat> hashMap) {
        for (String key : hashMap.keySet()) {
            System.out.println(key + " - " + hashMap.get(key).getAge());
        }
    }

    // Task 4
    private static void setOfStrings(ArrayList<String> strings) {
        Set<String> stringSet = new HashSet<>(strings);
        for (String s : stringSet
        ) {
            System.out.println(s);
        }
    }

    // Task 5
    private static void setOfIntegers(ArrayList<Integer> integers) {
        Set<Integer> integerSet = new HashSet<>(integers);
        integerSet.removeIf(integer -> integer > 10);

        for (Integer integer :
                integerSet) {
            System.out.println(integer);
        }
    }

    // Task 6
    private static void hashmapBirthdate(Map<String, LocalDate> birthdateMap) {

        ArrayList<Month> summerMonths = new ArrayList<>(List.of(
                Month.JUNE, Month.JULY, Month.AUGUST));

        ArrayList<String> keys = new ArrayList<>();

        for (String key : birthdateMap.keySet()) {
            if (summerMonths.contains(birthdateMap.get(key).getMonth()))
                keys.add(key);
        }

        for (String key : keys) {
            birthdateMap.remove(key);
        }

        for (String key : birthdateMap.keySet()) {
            System.out.println(key + ": " + birthdateMap.get(key));
        }

        System.out.println("Deleted Ones:" + keys);
    }

}
