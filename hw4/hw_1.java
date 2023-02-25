//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
package hw4;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class hw_1 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Random rand = new Random();
        int size = 10;
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(0, 101));
        }
        System.out.println("Случайно сгенерированный список - " +list.toString());
        list = reversList(list);
        System.out.println("Перевернутый список - " +list.toString());


    }
    public static List<Integer> reversList(List<Integer> list) {
        List<Integer> revers = new LinkedList<>();
        for (int i = list.size()-1; i > 0; i--) {
            revers.add(list.get(i));
        }
        return revers;
        
    }

}
