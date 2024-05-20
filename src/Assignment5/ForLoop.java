package Assignment5;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("############# Example of for loop ########### ");
        int sum = 0;
        for (int a = 1; a <= 10; a++) {
            sum = sum + a;
        }
        System.out.println("Sum from 1 to 10 is: " + sum);

        pyramid();
        printArrayElements();
        exampleOfDoWhile();
        useWhileLoop();
    }

    public static void pyramid() {
        int rows = 5;

        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printArrayElements() {
        System.out.println("############# Example of foreach loop ########### ");
        // create an array
        int[] numbers = {78, 15, 22, 100};

        // for each loop
        for (int number: numbers) {
            System.out.println(number);
        }
    }

    /**
     * This function will sum of positive integers only
     */
    public static void useWhileLoop() {
        System.out.println("############# Example of while loop ########### ");
        int sum = 0;

        Scanner input = new Scanner(System.in);

        // take integer input from the user
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        while (number >= 0) {
            sum += number;

            System.out.println("Enter a number: ");
            number = input.nextInt();
        }

        System.out.println("Sum = " + sum);
        input.close();
    }

    public static void exampleOfDoWhile() {
        System.out.println("############# Example of do while loop ########### ");
        int i = 1, n = 5;
        // do...while loop from 1 to 5
        do {
            System.out.println(i);
            i++;
        } while(i <= n);
    }
}
