//Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
package hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class hw_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        int n = 0;
        randArrayList(list, rand, 10, 0, 101);
        System.out.println("Случайно сгенерированный список - " + list.toString());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                n++;
                i--;
                size--;
            }

        }
        System.out.println("Список без четный чисел - " + list.toString() + "\nКоличество удаленных элементов = " + n);

    }

    public static void randArrayList(List<Integer> list, Random rand, int size, int min, int max) {
        for (int i = 0; i < size; i++)
            list.add(i, rand.nextInt(min, max));
    }
}
