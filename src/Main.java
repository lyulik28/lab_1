import java.util.Scanner;

public class Main {

    /**
     * Check if every element is greater than previous
     * @param array of integer numbers
     * @return true if greater
     */
    public static boolean isProgression(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Print numbers from 1 to 100,
     * if number divided without remainder by 3, print Fizz
     * divided without remainder by 5, print Buzz
     * divided without remainder by both 3 and 5, print FizzBuzz
     */
    public static void gameFizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" FizzBuzz ");
                continue;
            }
            if (i % 3 == 0) {
                System.out.print(" Fizz ");
            } else if (i % 5 == 0) {
                System.out.print(" Buzz ");
            } else {
                System.out.print(" " + i + " ");
            }
        }
    }

    /**
     * Check if it is possible to split array for two parts with equal summary number of elements
     * @param array of integer numbers
     * @return true if equal division is possible
     */
    public static boolean isDivisible(int[] array) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum2 += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            sum1 += array[i];
            sum2 -= array[i];
            if (sum1 == sum2) {
                return true;
            }
        }
        return false;
    }

    /**
     * The method from which the program starts
     * Creat array with printed length and printed elements, if printed length more than 2
     * Call previous methods
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Enter array length: ");
        Scanner input = new Scanner(System.in);
        int arrayLength = input.nextInt();
        if (arrayLength < 2) {
            System.out.print("Incorrect length!");
        } else {
            int[] intArray = new int[arrayLength];
            System.out.println("Enter " + arrayLength + " numbers");
            for (int i = 0; i < arrayLength; i++) {
                intArray[i] = input.nextInt();
            }
            System.out.println("Your array:");
            for (int x : intArray) {
                System.out.print(x + " ");
            }
            System.out.println("\nFirst task: " + isProgression(intArray));
            System.out.println("Third task: " + isDivisible(intArray));
        }
        System.out.println("Second task: ");
        gameFizzBuzz();
    }
}