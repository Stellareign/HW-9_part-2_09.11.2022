
import java.util.Arrays;
public class Main {
       public static void main (String[]args){
        System.out.println("Домашка 9, МАССИВЫ, часть 2, от 09.11.2022 - Задача 1"); //
        System.out.println("Случайные траты по дням составили: " + Arrays.toString(arr));
           int sumWastesMonth = 0;
           for (int i = 0; i < arr.length; i++)
               sumWastesMonth += arr[i];
           System.out.println("Сумма трат за месяц составила " + sumWastesMonth + " рублей"); // боже, полдня ушло на это, из-за того что
           // непонятно было, куда именно вставить генерацию массива и где писать код
// не понимаю, почему генерировать можно (нужно) после кода :(
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


