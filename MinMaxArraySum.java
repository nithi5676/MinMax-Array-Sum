package minMaxArray;

import java.util.Scanner;

public class MinMaxArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int size = scanner.nextInt();
        System.out.println("Enter Elements into the Array");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        MinMaxArraySum minmaxarraysum = new MinMaxArraySum();
        minmaxarraysum.minMaxSum(array);
    }

    public void minMaxSum(int array[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int iterator = 0; iterator < array.length; iterator++) {
            if (array[iterator] < min) {
                min = array[iterator];
            }
            if (array[iterator] > max) {
                max = array[iterator];
            }
        }
        System.out.println(max + min);
    }
}
