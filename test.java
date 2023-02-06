import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(); // объява листа
        Scanner scan = new Scanner(System.in); // оъява сканера
        Map<String, Integer> phoneBook = new HashMap<>(); // объява тел книги
        System.out.println("Введите Фио"); // запрос на фио
        String fio = scan.nextLine(); // запись в переменную
        System.out.println("Введите номер телефона"); // запрос на телефон
        int number = scan.nextInt(); // запись в переменную
        //phoneBook.put(fio, list); // перезаписывает
        phoneBook.put("первый", 1);
        phoneBook.put("второй", 2);
        phoneBook.put("третий", 3);
        phoneBook.put("четвертый", 4);
        System.out.println(phoneBook.values());

    }
}
