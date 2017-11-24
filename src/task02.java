import java.util.Scanner;

public class task02 {

    public static void main(String[] args) {

//        Задание 2 (дополнительное)
//        Добавить к программе из задания 1 следующее:
//        7. вывести в консоль максимальное кол-во повторений чисел в массиве
//        пример 1:
//        массив 1, 2, 3, 4, 1, 6.
//        Ответ - 2. Так как число 1 повторяется 2 раза
//
//        пример 2:
//        массив 1, 1, 1, 4, 6, 6.
//        Ответ - 3. Так как число 1 повторяется 3 раза. А число 6 повторяется 2 раза. Поскольку надо вывести максимум, выводим 3.
//
//        пример 3:
//        массив 2, 3, 3, 5, 5, 6
//        Ответ - 3. Так как 3 и 5 повторяются по 2 раза, неважно кого из них подсчитывать, цель - вывести максимум.
//        В этом примере максимум повторений чисел является 2 раза.
//
//        8. вывести в консоль минимальное кол-во повторений чисел в массиве

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int rep = 0;

        Scanner scanner = new Scanner(System.in);
//  ----- 1. на вход через консоль принимает размер массива ----
        System.out.println("Введите размер массива A: ");
        int ALength = scanner.nextInt();
        int[] A = new int[ALength];
//  ------ 2. на вход через консоль принимает массив чисел -----
        System.out.println("Введите элементы массива A: ");
        for (int i = 0; i < ALength; i++) {
            A[i] = scanner.nextInt();
        }
//  - 3. найти минимальное число в массиве и вывести в консоль -
        for (int element : A)
            if (element < min)
                min = element;
        System.out.println("Минимальное число в массиве А: " + min);
//  - 4. найти максимальное число в массиве и вывести в консоль -
        for (int element : A)
            if (element > max)
                max = element;
        System.out.println("Максимальное число в массиве А: " + max);
//  - 5. посчитать кол-во повторений числа 5 и вывести в консоль -
        for (int element : A)
            if (element == 5)
                rep++;
        System.out.println("Количество повторений числа 5 в массиве А: " + rep);
//  --------- 6. вывести в консоль отсортированный массив ------
        for (int j = ALength - 1; j > 0; j--){
            for (int i = 0; i < j; i++)
                if (A[i] > A[i + 1]) {
                    A[i] ^= A[i + 1];
                    A[i + 1] ^= A[i];
                    A[i] ^= A[i + 1];
                }
        }
        for (int element: A) {
            System.out.print(element + " ");
        }
//  ------------------------------------------------------------

    }
}