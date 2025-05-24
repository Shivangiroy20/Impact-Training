package com.parulConditional;

import java.util.*;

public class GradeSystemInSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Grade:");
        int grade = sc.nextInt();

        switch (grade / 10) {
            case 10: 
            case 9:
                System.out.println("Outstanding");
                break;
            case 8:
            case 7:
                System.out.println("A+");
                break;
            case 6:
                System.out.println("A");
                break;
            case 5:
            case 4:
                System.out.println("Pass");
                break;
            default:
                System.out.println("Fail");
        }

        sc.close();
    }
}
