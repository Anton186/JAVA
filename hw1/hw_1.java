// +Написать программу вычисления n-ого треугольного числа. url
package hw1;

import java.util.Scanner;

public class hw_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scan.nextInt();
        scan.close  ();
        int res = 0;
        res = number*(number+1)/2;
        System.out.println("Вычисление " + number + " треугольного числа, равно: " + res);

    }
}
