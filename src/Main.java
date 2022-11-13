import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 9, МАССИВЫ, часть 2, от 09.11.2022 - Задача 3"); // о, ну это было легко!
        System.out.println("Траты по дням за месяц составили " + Arrays.toString(arr));
        double summExpensesMonth = 0;
        double middleExpensesMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            summExpensesMonth += arr[i];
        }
        middleExpensesMonth = summExpensesMonth / arr.length;
        System.out.println("Сумма трат за месяц составила " + summExpensesMonth + " рублей");
        System.out.println("Средняя сумма трат за месяц составила " + middleExpensesMonth + " рублей");
    }//
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



