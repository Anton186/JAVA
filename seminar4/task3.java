
//1) Написать метод, который принимает массив элементов, помещает их в стэк
// и выводит содержимое стэка, доставая его содержимое по одному.
//2) Написать метод, который принимает массив элементов, помещает их в очередь
// и выводит на консоль содержимое очереди, доставая её содержимое по одному.

package seminar4;

import java.util.Stack;

public class task3 {
    public static void main(String[] args) {
        fillPrintStack(new int[] { 1, 2, 3, 4, 5, 6 });
    }

    private static void fillPrintStack(int[] numbers) {
        Stack<Integer> stackNumber = new Stack<>();
        for (int i = 0; i < numbers.length; i++) {
            stackNumber.push(numbers[i]);
        }

        while (!stackNumber.isEmpty()) {
            System.out.println(stackNumber.pop()); // stackNumber.pop() удаляет элемент
        }
    }

}
