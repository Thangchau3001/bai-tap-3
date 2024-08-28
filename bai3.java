package assignment3;

import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu mang");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("nhap phan tu thu " + (i + 1) + " ");
            arr[i] = sc.nextInt();
            sum += arr[i];

        }
        System.out.println("tong cac phan tu trong mang la " + sum);
        double avg = (double) sum / n;
        System.out.println("trung binih cac phan tu trong mang la: " + avg);
    }

}
