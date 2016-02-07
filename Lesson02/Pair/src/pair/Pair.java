package pair;

import java.util.Scanner;

/**
 * Created by X on 2/5/2016.
 */
public class Pair {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vvedite cheslo");
        int end = in.nextInt();
        for (int i = 2; i <= end; i++) {
            if (end == 2) {
                System.out.println("This number was only pair");
            } else if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
