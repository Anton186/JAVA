// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

package hw4;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class hw_2 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Random rand = new Random();
        int size = 10;
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(0, 101));
        }
        System.out.println("Случайно сгенерированный список - " + list.toString());
        enqueue(list, 101);
        System.out.println("Элемент 101 добавлен в конец очереди, новый список - "+list.toString());
        int element = dequeue(list);
        System.out.println("Первый элемент " + element + " удален из списка, новый список - " +list.toString());
        int firstElement = first(list);
        System.out.println("Первый элемент " + firstElement + " не удален из списка, список - " +list.toString());

    }

    public static void enqueue(List<Integer> list, int element) { //помещает элемент в конец очереди, 
        list.add(element);

    }

    public static int dequeue(List<Integer> list) { //возвращает первый элемент из очереди и удаляет его, 
        int element = list.get(0);
        list.remove(0);
        return element;

    }
    public static int first(List<Integer> list) { //возвращает первый элемент из очереди, не удаляя.
        int element = list.get(0);
        return element;
    }
}
