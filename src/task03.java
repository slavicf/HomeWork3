import java.util.Scanner;

public class task03 {

    public static void main(String[] args) {

//        Задание 3 (дополнительное)
//        9. Избавиться от пункта номер один. Пользователь не вводит явно длину массива.
//        Он вводит только содержимого самого массива в одну строку.
//        Программа должна создать массив подходящего размера автоматически и заполнить массив введенными пользователем данными.
//        пример:
//        10, 10, 10, 10 тут размер массива 4;
//        10, 10 тут размер массива 2

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int rep = 0;

        Scanner scanner = new Scanner(System.in);
//  ----- 1. на вход через консоль принимает размер массива ----
//        System.out.println("Введите размер массива A: ");
//        int ALength = scanner.nextInt();
//        int[] A = new int[ALength];
//  ------ 2. на вход через консоль принимает массив чисел -----
        System.out.println("Введите элементы массива A одной строкой через пробел: ");
        String Astring = scanner.nextLine();
        String[] Aparts = Astring.split("\\D");
        int ALength = Aparts.length;
        int[] A = new int[ALength];

        for (int i = 0; i < ALength; i++) {
            A[i] = Integer.parseInt(Aparts[i]);
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
//  - 7. вывести в консоль максимальное кол-во повторений чисел в массиве -
        max = Integer.MIN_VALUE;

        for (int j = 0; j < 10; j++){
            rep = 0;
            for (int element : A)
                if (element == j)
                    rep++;

            if (rep > max)
                max = rep;
        }
        System.out.print("\n" + max);
//  ------------------------------------------------------------

    }
}
