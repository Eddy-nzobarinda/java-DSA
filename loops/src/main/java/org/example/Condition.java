package org.example;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter salary: ");
        int salary = scanner.nextInt();
        if(salary >= 3000){
            System.out.println("you are a senior");
        } else if (salary >= 2000) {
            System.out.println("you are a junior");
        } else {
            System.out.println("you are not like us");
        }
    }
}
