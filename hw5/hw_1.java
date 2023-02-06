//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.
package hw5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class hw_1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        Map<String, ArrayList<Integer>> phoneBook = new HashMap<>();
        String fio = null;
        while(true) {
            System.out.println("Введите Фио, для остановки напишите stop");
            fio = scan.nextLine();
            if(fio.equals("stop")){
                System.out.println("Телефонная книга заполнена следующими значениями: " + phoneBook.entrySet());
                break;
            }
            System.out.println("Введите номер телефона");
            int number = Integer.parseInt(scan.nextLine());
            if (phoneBook.containsKey(fio)) {
                phoneBook.computeIfAbsent(fio, k -> new ArrayList<>()).add(number);
            } else {
                phoneBook.computeIfAbsent(fio, k -> new ArrayList<>()).add(number);
            }
        }
        scan.close();

    }
}
