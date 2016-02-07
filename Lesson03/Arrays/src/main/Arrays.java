package main;

import java.util.Scanner;

/**
 * Created by X on 2/6/2016.
 */
public class Arrays {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] array = new int[10];
        System.out.println("initial mass");
        for (int x : array) {
            System.out.print(x + " ");
        }

        System.out.println("\n" + "enter the array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
            System.out.println("array{" + i  + "] = " + array[i]);
        }

    }
}
