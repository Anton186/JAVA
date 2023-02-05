//Реализовать консольное приложение, которое в цикле:
//Принимает от пользователя строку вида 
//text~num
//Нужно разделить строку по ~, сохранить text в связный список на позицию num.
//Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
package seminar4;

import java.util.LinkedList;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        while(true){
            System.out.println("Введите строку вида text~num ");
            String input = scanner.nextLine();
            if (input.equals("stop"))
                break;
            String[] parts = input.split("~");
            if (parts[0].equals("print")) {
                int k = Integer.parseInt(parts[1]);
                list.remove(k);
                System.out.println(list.get(k));
                System.out.println(list);
            }else{
            list.add(Integer.parseInt(parts[1]) ,parts[0]); //Integer.parseInt превращает в число
            System.out.println(list);
            }
        }
        scanner.close();
    }
}
