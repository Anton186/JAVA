//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.
package hw5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class hw_1 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();  // объява листа
        Scanner scan = new Scanner(System.in); // оъява сканера
        Map<String, List<Integer>> phoneBook = new HashMap<>(); // объява тел книги
        System.out.println("Введите Фио"); // запрос на фио
        String fio = scan.nextLine(); // запись в переменную
        System.out.println("Введите номер телефона"); // запрос на телефон
        int number = scan.nextInt(); // запись в переменную
        phoneBook.put(fio, list); // перезаписывает
        if (phoneBook.containsKey(fio)) {
            list.clear();
            list.add(phoneBook.keySet(fio));
            
        }

    }
}
