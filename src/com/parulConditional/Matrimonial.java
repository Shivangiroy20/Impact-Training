package com.parulConditional;
import java.util.Scanner;

public class Matrimonial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

     
        System.out.print("Enter your gender (Male/Female): ");
        String gender = sc.nextLine();

        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); 

        
        System.out.print("Are you single? (yes/no): ");
        String isSingle = sc.nextLine();

        boolean eligible = false;

        if (isSingle.equalsIgnoreCase("yes")) {
            if (gender.equalsIgnoreCase("male") && age >= 21) {
                eligible = true;
            } else if (gender.equalsIgnoreCase("female") && age >= 18) {
                eligible = true;
            }
        }

        
        if (eligible) {
            System.out.println("\n" + name + ", you are eligible to register on the matrimonial site.");
        } else {
            System.out.println("\nSorry " + name + ", you are not eligible to register on the matrimonial site.");
        }

        sc.close();
    }
}