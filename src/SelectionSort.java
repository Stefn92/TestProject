import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    // Algorithmus zum Sortieren von Integer-Werten aufsteigend

    static int[] numbers;

    public static void main(String[] args) {
        fillRandomNumbers();
        System.out.println("Vorher: " + getValues());
        long startTime = System.currentTimeMillis();
        selectionSort();
        long endTime = System.currentTimeMillis();
        System.out.println("Nachher: " + getValues());
        System.out.println("Zeit: " + (endTime - startTime) + "ms");
    }

    public static void fillRandomNumbers() {
        Random random = new Random();
        int arraySize = 10000;
        numbers = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = random.nextInt(100000);
        }
    }

    public static void selectionSort() {

        // Array durchlaufen und immer die kleinste Zahl nach jedem Durchlauf mit dem aktuellen Index tauschen

        for (int i = 0; i < numbers.length - 1; i++) {
            int lowest = numbers[i];
            int indexAtLowest = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < lowest) {
                    lowest = numbers[j];
                    indexAtLowest = j;
                }
            }
            numbers[indexAtLowest] = numbers[i];
            numbers[i] = lowest;
        }
    }

    public static String getValues() {
        return Arrays.toString(numbers);
    }
}
