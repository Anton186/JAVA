// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.

// Создать множество ноутбуков.

// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:

// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.package hw6;
package hw6;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Laptop Laptop1 = new Laptop("Lenovo", "Intel X7", 4, "Windows", "Yellow");
        Laptop Laptop2 = new Laptop("Lenovo", "Intel X5", 6, "MacOS", "Black");
        Laptop Laptop3 = new Laptop("Lenovo", "Intel X9", 8, "Windows", "Red");
        Laptop Laptop4 = new Laptop("ACER", "Intel X5", 4, "MacOS", "Blue");
        Laptop Laptop5 = new Laptop("ACER", "Intel X9", 8, "Windows", "Red");
        Laptop Laptop6 = new Laptop("ACER", "Intel X7", 6, "Windows", "Black");

        List<Laptop> Laptops = List.of(Laptop1,Laptop2,Laptop3,Laptop4,Laptop5,Laptop6);




        Operations operation;
        operation = new Operations(Laptops);
        operation.start();

    }
}