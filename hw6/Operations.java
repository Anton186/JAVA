package hw6;

import java.util.*;

public class Operations {
    private List<Laptop> notebooks;
    private static Scanner scanner = new Scanner(System.in);

    public void printList() {
        for (Laptop notebook : notebooks) {
            {
                System.out.println(notebook);
            }
        }
    }

    public Operations(List<Laptop> notebooks) {
        this.scanner = new Scanner(System.in);
        this.notebooks = (List<Laptop>) notebooks;

    }

    public String getOperations() {

        String text = "Выберите операцию: 1. Выбрать критерий для фильтра 2. Вывести список 3. Завершить.";

        System.out.print(text);
        System.out.println();

        String answer = scanner.next();

        return answer;
    }

    public void start() {

        boolean flag = true;
        while (flag) {

            String operation = getOperations();
            if (operation.equals("3")) {
                flag = false;
                System.out.println("Выход!");
                scanner.close();
                continue;
            } else if (operation.equals("1")) {
                filter();
            } else if (operation.equals("2")) {
                printList();
            }else
                System.out.println("Не верно введена команда!");
        }
    }

    public <notebooks> void filter() {
        scanner = new Scanner(System.in);
        System.out.print(
                "Выберите критерий для поиска: 1. операционная система, 2. оперативная память, 3. Цвет, 4. название: ");
        String op = scanner.nextLine();

        // Операционная система
        if (op.equals("1")) {
            System.out.print("Выберите критерий : 1. Windows, 2. macOS: ");
            String os = scanner.nextLine();
            if (os.equals("1")) {
                for (int i = 0; i < notebooks.size(); i++) {
                    if (notebooks.get(i).getOs().equals("Windows")) {
                        System.out.println(notebooks.get(i));
                    }

                }
            } else if (os.equals("2")) {
                for (int i = 0; i < notebooks.size(); i++) {
                    if (notebooks.get(i).getOs().equals("macOS")) {
                        System.out.println(notebooks.get(i));
                    }
                }
            } else
                System.out.println("Не верно введена команда");
        }

        // Оперативная память
        else if (op.equals("2")) {
            System.out.print("Выберите критерий : 4, 6, 8: ");
            int colGig = scanner.nextInt();
            if (colGig == 4) {
                for (int i = 0; i < notebooks.size(); i++) {
                    if (notebooks.get(i).getRam() == 4) {
                        System.out.println(notebooks.get(i));
                    }
                }
            } else if (colGig == 6) {
                for (int i = 0; i < notebooks.size(); i++) {
                    if (notebooks.get(i).getRam() == 6) {
                        System.out.println(notebooks.get(i));
                    }
                }
            } else if (colGig == 8) {
                for (int i = 0; i < notebooks.size(); i++) {
                    if (notebooks.get(i).getRam() == 8) {
                        System.out.println(notebooks.get(i));
                    }
                }

            } else
                System.out.println("Неверно задано значение!");

        }
        else if (op.equals("3")) {
            System.out.print("Выберите критерий : 1. Yellow, 2. Green,3 Black");
            int color = scanner.nextInt();
            if (color == 1) {
                for (Laptop notebook : notebooks) {
                    {
                        if (notebook.getColor().equals("Yellow")) {
                            System.out.println(notebook);
                        }
                    }
                }
            } else if (color == 2) {
                for (Laptop notebook : notebooks) {
                    {
                        if (notebook.getColor() == "Green") {
                            System.out.println(notebook);
                        }
                    }
                }
            } else if (color == 3) {
                for (Laptop notebook : notebooks) {
                    {
                        if (notebook.getColor() == "Black") {
                            System.out.println(notebook);
                        }
                    }
                }
            } else
                System.out.println("Неверно задано значение!");

        }
        // Модель
        else if (op.equals("4")) {
            System.out.print("Выберите критерий : 1. Lenovo, 2. ACER");
            int model = scanner.nextInt();
            if (model == 1) {
                for (Laptop notebook : notebooks) {
                    {
                        if (notebook.getColor().equals("Lenovo")) {
                            System.out.println(notebook);
                        }
                    }
                }
            } else if (model == 2) {
                for (Laptop notebook : notebooks) {
                    {
                        if (notebook.getColor() == "ACER") {
                            System.out.println(notebook);
                        }
                    }
                }
            } else
                System.out.println("Неверно задано значение!");
        }
    }

}