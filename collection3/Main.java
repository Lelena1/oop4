package collection3;

import java.util.*;


public class Main {
    private static final Map<String, Integer> task3Map = new HashMap<>();

    public static void main(String[] args) {
        doTask_Collection3_hw1_1();
        doTask_Collection3_hw1_3();
        doTask_Collection3_hw2_1();
        doTask_Collection3_hw2_2();
    }

    public static void doTask_Collection3_hw1_1() {

        System.out.println("Коллекции - 3, домашнее задание 1, задача 1");
        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Ivan Ivanov", "89880214501");
        phoneBook.put("Petr Petrov", "+7998530214502");
        phoneBook.put("Sidor Sidorov", "+3807180214503");
        phoneBook.put("Petr Ivanov", "+489880214504");
        phoneBook.put("Ivan Sidorov", "+794980214505");
        phoneBook.put("Ivan Petrov", "89345214506");
        phoneBook.put("Petr Sidorov", "89880224507");
        phoneBook.put("Sidor Ivanov", "8983452108");
        phoneBook.put("Sidor Petrov", "89321094509");
        phoneBook.put("Efim Efimov", "88882514510");
        phoneBook.put("Ivan Efimov", "87230214511");
        phoneBook.put("Klim Klimov", "85544314512");
        phoneBook.put("Efim Ivanov", "89998874513");
        phoneBook.put("Efim Petrov", "89098214514");
        phoneBook.put("Efim Sidorov", "8988333315");
        phoneBook.put("Klim Ivanov", "89880111116");
        phoneBook.put("Ivan Klimov", "89880555517");
        phoneBook.put("Klim Sidorov", "89877664518");
        phoneBook.put("Petr Klimov", "89823234519");
        phoneBook.put("Sidor Klimov", "83423514520");

        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void doTask_Collection3_hw1_3() {
        System.out.println();
        System.out.println("Коллекции - 3, домашнее задание 1, задача 3");

        task3Map.put("key1", 2);
        addInMap("key2", 3);
        addInMap("key3", 4);
        addInMap("key3", 5);
//        addInMap("key1", 2);

        for (Map.Entry<String, Integer> entry : task3Map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void addInMap(String str, int num) {
        if (task3Map.containsKey(str) && task3Map.containsValue(num)) {
            throw new IllegalArgumentException("Такая пара ключ-значение уже существует");
        }
        task3Map.put(str, num);
    }


    public static void doTask_Collection3_hw2_1() {
        System.out.println();
        System.out.println("Коллекции - 3, домашнее задание 2, задача 1");
        System.out.println("Map<String, List<Integer>> numsMap = new HashMap<>():");
        Random random = new Random();
        Map<String, List<Integer>> numsMap = new HashMap<>();
        numsMap.put("Ключ1", List.of(
                random.nextInt(0, 1000),
                random.nextInt(0, 1000),
                random.nextInt(0, 1000))
        );
        numsMap.put("Ключ2", List.of(
                random.nextInt(0, 1000),
                random.nextInt(0, 1000),
                random.nextInt(0, 1000))
        );
        numsMap.put("Ключ3", List.of(
                random.nextInt(0, 1000),
                random.nextInt(0, 1000),
                random.nextInt(0, 1000))
        );
        numsMap.put("Ключ4", List.of(
                random.nextInt(0, 1000),
                random.nextInt(0, 1000),
                random.nextInt(0, 1000))
        );
        numsMap.put("Ключ5", List.of(
                random.nextInt(0, 1000),
                random.nextInt(0, 1000),
                random.nextInt(0, 1000))
        );

        for (Map.Entry<String, List<Integer>> entry : numsMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        Map<String, Integer> numsMap2 = new HashMap<>();
        System.out.println();
        System.out.println("Map<String, Integer> numsMap2 = new HashMap<>():");

        for (Map.Entry<String, List<Integer>> entry : numsMap.entrySet()) {
            numsMap2.put(entry.getKey(), calculateSumNums(entry.getValue()));
        }
        for (Map.Entry<String, Integer> entry : numsMap2.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static int calculateSumNums(List<Integer> numsList) {
        int sum = 0;
        for (Integer integer : numsList) {
            sum += integer;
        }
        return sum;
    }

    public static void doTask_Collection3_hw2_2() {
        System.out.println();
        System.out.println("Коллекции - 3, домашнее задание 2, задача 2");
        Map<Integer, String> task2_1Map = new LinkedHashMap<>();
        task2_1Map.put(1, "course1");
        task2_1Map.put(2, "course2");
        task2_1Map.put(3, "course3");
        task2_1Map.put(4, "course4");
        task2_1Map.put(5, "course5");
        task2_1Map.put(6, "course6");
        task2_1Map.put(7, "course7");

        for (Map.Entry<Integer, String> entry : task2_1Map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
