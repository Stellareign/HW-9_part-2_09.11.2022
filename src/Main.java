
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 9, МАССИВЫ, часть 2, от 09.11.2022 - Задача 2"); // найти max и min. Просто оловой об стену.
        System.out.println("Траты по дням за месяц составили " + Arrays.toString(arr));
        int maxExpensesMonth = arr[0];
        int minExpensesMonth = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minExpensesMonth)
                minExpensesMonth = arr[i];
            if (arr[i] > maxExpensesMonth)
                maxExpensesMonth = arr[i];
        }
        System.out.println("Минимальная сумма трат за месяц составила " + minExpensesMonth + " рублей");
        System.out.println("Максимальная сумма трат за месяц составила " + maxExpensesMonth + " рублей");
    }
    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}



