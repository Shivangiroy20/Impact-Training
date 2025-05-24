package com.Pattern;

public class Diamond {

	public static void main(String[] args) {
		int  n = 5;
		for (int i = 1; i <= n; i += 2) {
            for (int j = 1; j <= (n - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (k == 1 || k == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//lower half
        for (int i = n - 2; i >= 1; i -= 2) {
            for (int j = 1; j <= (n - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (k == 1 || k == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}