import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = arrayRandom(30);

        // case 1 (Сумма трат за месяц)
        System.out.println("case 1 (Сумма трат за месяц)");

        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // case 2 (найти минимальную и максимальную трату)
        System.out.println("case 2 (найти минимальную и максимальную трату)");
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила: " + max + " рублей. " +
                " Максимальная сумма трат за день составила: " + min + " рублей");

        // case 3 (Средняя сумма трат)
        System.out.println("case 3 (Средняя сумма трат)");

        System.out.println("Средняя сумма трат за месяц составила " + (double) sum / array.length + " рублей");

        // case 4 (вывод Ф. И. О. сотрудников в корректном виде)
        System.out.println("case 4 (вывод Ф. И. О. сотрудников в корректном виде)");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] arrayRandom(int length) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100_000) + 100_000;
            ;
        }
        return array;
    }
}