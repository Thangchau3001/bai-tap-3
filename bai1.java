package assignment3;

import java.util.Random;
import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {

        String a;
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("nhap chuoi");
            a = scanner.next();
            Random rand = new Random();
            int n = rand.nextInt(100 - 1 + 1) + 1;
            if (n % 2 == 0) {
                System.out.println(n + "la so chan");
            } else {
                System.out.println(n + "la so le");
            }
        } while (a.equals("yes"));

    }

}
