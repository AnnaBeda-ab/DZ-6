import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Завдання 1: ");
        totalEven();
        System.out.println("Завдання 2: ");
        printString();
        System.out.println("Завдання 3: ");
        ArrayHomework arrayHomework = new ArrayHomework();
        arrayHomework.task ();
    }

    /*    1. Написати метод який приймає массив цілих чисел і вертає суму всіх його парних елементів
       (не тих які мають парні індекси, а ті які самі є парними). [8,2,3,4,5,6,7] -> 20   */

    public static void totalEven() {
        int[] array = new int[]{8, 2, 3, 4, 5, 6, 7};
        int total = 0;
        for (Integer numer : array) {
            int sum = 0;
            if (numer % 2 == 0) {
                sum = numer;
            }
            total += sum;
        }
        System.out.println(total);
    }

    /**
     * 2. Написати метод приймає стрінгу і друкує всі її унікальні значення з нового рядка.
     * Alexx9800
     * A
     * l
     * e
     * x
     * 9
     * 8
     * 0
     **/
    public static void printString() {
        List<String> printUnic = new ArrayList<>();
        printUnic.add("Alexx9800");
        List<Character> charSingle = new ArrayList<>();
        for (String element : printUnic) {
            char letter[] = element.toCharArray();
            for (Character character : letter) {
                if (charSingle.contains(character)) {
                    continue;
                } else {
                    charSingle.add(character);
                    System.out.println(character);
                }
            }
        }
    }
}

