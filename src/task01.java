import java.util.Scanner;

public class task01 {

    public static void main(String[] args) {

//        Задание 1
//        Создать новый проект на GitHub и на локальном компе
//        Написать программу которая:
//        1. на вход через консоль принимает размер массива
//        2. на вход через консоль принимает массив чисел
//        3. найти минимальное число в массиве и вывести в консоль (без использования сортировки)
//        4. найти максимальное число в массиве и вывести в консоль (без использования сортировки)
//        5. посчитать кол-во повторений числа 5 и вывести в консоль
//        6. вывести в консоль отсортированный массив

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
