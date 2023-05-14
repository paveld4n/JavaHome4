// Задача 1
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

import java.util.Arrays;
import java.util.LinkedList;

public class task4_1 {
    static LinkedList<Integer> reversList(LinkedList<Integer> listLinked) {
        LinkedList<Integer> listResult = new LinkedList<>();
        for (int element : listLinked) {
            listResult.addFirst(element);            
        }
        return listResult;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(23, -77, 13, 9, -4, 7, 55, 42, 8, 12));
        System.out.println(list1);
        System.out.println(reversList(list1));
    }
}