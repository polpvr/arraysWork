package app;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{-55, 99, 36, 40, -19, -22, 20, 30, -7, -37, 50, 60, -21, 3, 74, -15, 25, -67, 1, -5};


        System.out.print("Елементи масиву: [");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");


        int sumNegative = 0;
        for (int num : numbers) {
            if (num < 0) {
                sumNegative += num;
            }
        }

        System.out.println("Сума від'ємних чисел: " + sumNegative);


        int evenCount = 0;
        int oddCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Кількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);


        int elementMax = numbers[0];
        int elementMin = numbers[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > elementMax) {
                elementMax = numbers[i];
                maxIndex = i;
            }
            if (numbers[i] < elementMin) {
                elementMin = numbers[i];
                minIndex = i;
            }
        }

        System.out.println("Найменший елемент: " + elementMin + " (з індексом " + minIndex + ")");
        System.out.println("Найбільший елемент: " + elementMax + " (з індексом " + maxIndex + ")");


        int firstNegative = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                firstNegative = i;
                break;
            }
        }

        if (firstNegative == -1) {
            System.out.println("В масиві немає від'ємних чисел.");
        } else {
            int sumAfterFirstNegative = 0;
            int countAfterFirstNegative = 0;
            for (int i = firstNegative + 1; i < numbers.length; i++) {
                sumAfterFirstNegative += numbers[i];
                countAfterFirstNegative++;
            }
            double averageAfterFirstNegative = (double) sumAfterFirstNegative / countAfterFirstNegative;
            System.out.println("Середнє арифметичне чисел після першого від'ємного числа: " + averageAfterFirstNegative);
        }
    }
}