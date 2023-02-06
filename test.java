import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(); // объява листа
        Scanner scan = new Scanner(System.in); // оъява сканера
        Map<String, ArrayList<Integer>> phoneBook = new HashMap<>(); // объява тел книги
        String fio = null;
        do {
            System.out.println("Введите Фио, для остановки напишите stop"); // запрос на фио
            fio = scan.nextLine(); // запись в переменную
            fio = scan.nextLine(); // запись в переменную
            System.out.println("Введите номер телефона"); // запрос на телефон
            int number = scan.nextInt(); // запись в переменную
            if (phoneBook.containsKey(fio)) {
                //list.clear();
                System.out.println(list.toString()+" - пустой лист");
                //list = phoneBook.get(fio);
                //System.out.println(list.toString()+" - лист равен фонбук с таким фио");
                //list.add(list.size(), number);
                //System.out.println(list.toString() + " добавлен новый номер к фио");
                phoneBook.computeIfAbsent(fio, k -> new ArrayList<>()).add(number);
                System.out.println(phoneBook.get(fio)+ "новые телефоны этого фио");
            } else {
                //list.clear();
                //list.add(list.size(), number);
                phoneBook.computeIfAbsent(fio, k -> new ArrayList<>()).add(number);
                System.out.println(list.toString() + " создан фио и номер");
            }
            System.out.println(phoneBook.entrySet());
        } while (!"fio".equals("stop"));
        scan.close();
    }
}
