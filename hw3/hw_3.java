//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.
package hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class hw_3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        randArrayList(list, rand, 10, 0, 101);
        System.out.println("Случайно сгенерированный список - " + list.toString());
        System.out.println("Минимальное значение - " + minValue(list));
        System.out.println("Максимальное значение - " + maxValue(list));
        System.out.println("Среднее арифметическое значение - " + averageOf(list));

    }

    public static void randArrayList(List<Integer> list, Random rand, int size, int min, int max) {
        for (int i = 0; i < size; i++)
            list.add(i, rand.nextInt(min, max));
    }

    public static int minValue(List<Integer> list) {
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i))
                min = list.get(i);
        }
        return min;
    }

    public static int maxValue(List<Integer> list) {
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i))
                max = list.get(i);
        }
        return max;
    }
    public static int averageOf(List<Integer> list) {
        int average = 0;
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            
        }
        average = sum / list.size();

        return average;
    }
}
