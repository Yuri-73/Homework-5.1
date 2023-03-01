import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       task1();
       task2();
       task3();
       task4();
    }
    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
       java.util.Random random = new java.util.Random();
       int[] arr = new int[30];
       for (int i = 0; i < arr.length; i++) {
          arr[i] = random.nextInt(100_000) + 100_000;
       }
       return arr;
    }
    public static void task1() {
       System.out.println("Задача 1. Подсчитать общую сумму за месяц:");
       int[] arr = generateRandomArray(); // Объявление массива с вызовом метода генерации случайных чисел
       int total = 0;
       System.out.print("Ежедневные траты в течении 30 дней: ");
       for (int i = 0; i < arr.length; i++) {
          total += arr[i];
          System.out.print(arr[i] + " ");
       }
       System.out.println("");
       System.out.println("Сумма трат за месяц составила " + total + " рублей");
    }
    public static void task2() {
        System.out.println("Задача 2. Определить максимальную и минимальную ежедневные траты:");
        int[] arr = generateRandomArray(); // Объявление массива с вызовом метода генерации случайных чисел
        int maxWaste = -1;
        int minWaste = 200_001;
        System.out.print("Ежедневные траты в течении 30 дней: ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxWaste)
                maxWaste = arr[i];
            if(arr[i] < minWaste)
                minWaste = arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("Минимальная сумма трат за день составила " + minWaste + " рублей. Максимальная сумма трат за день составила " + maxWaste + " рублей");
    }
    public static void task3() {
        System.out.println("Задача 3. Определить среднюю сумму трат в течении 30 дней:");
        int[] arr = generateRandomArray(); // Объявление массива с вызовом метода генерации случайных чисел
        int total = 0;
        System.out.print("Ежедневные траты в течении 30 дней: ");
        for (int i = 0; i < arr.length; i++) {
           total += arr[i];
           System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("Средняя сумма трат за месяц составила " + (double)total / 30 + " рублей");
    }
    public static void task4() {
        System.out.print("Задача 4. Исправление бага в символьном массиве: ");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 0; i < reverseFullName.length; i++)
            System.out.print(reverseFullName[i]);
        System.out.println("");

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}