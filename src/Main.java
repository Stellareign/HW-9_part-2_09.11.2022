public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 9, МАССИВЫ, часть 2, от 09.11.2022 - Задача 4"); // о, ну это было легко!
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char fullName = 0;
        for (int i = reverseFullName.length-1; i >= 0; i--) {
        fullName = reverseFullName[i];
            System.out.print(fullName);

        }

    }
}



