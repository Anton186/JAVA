// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
package hw2;

import java.io.IOException;
import java.util.Random;
import java.util.logging.*;

public class hw_2 {
    public static void main(String[] args) throws SecurityException, IOException {
        int[] mas = new int[10];
        mas = randomArray(mas);
        System.out.println("Случайно сгенерированный массив: ");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        mas = bobleSort(mas);
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

    }
    public static int[] bobleSort(int[] array) throws SecurityException, IOException{
        Logger logger = Logger.getLogger(hw_2.class.getName());
        FileHandler fh = new FileHandler("hw2/log.txt");
        logger.addHandler(fh);
        boolean done = true;
        int temp;
        while(done){
            done = false;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    logger.log(Level.WARNING, String.format("\n%d и %d поменялись местами на индексе %d и %d", array[i], array[i+1], i, i+1));
                    done = true;
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        return array;
    }
    public static int[] randomArray(int[] array){
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(0, 101);
        }
        return array;
    }

}
