package com.parulConditional;

import java.util.*;

public class GradeSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Grade:");
        int Grade = sc.nextInt(); 

        if (Grade >= 90) {
            System.out.println("Outstanding");
        } else if (Grade >= 75) {
            System.out.println("A+");
        } else if (Grade >= 60) {
            System.out.println("A");
        } else if (Grade >= 45) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        sc.close(); 
    }

}