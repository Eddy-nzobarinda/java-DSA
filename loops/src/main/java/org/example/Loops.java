package org.example;

import java.util.Scanner;

public class Loops {
//    Question: print numbers from 1 to 5
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        for (count=1; count <= 5; count++){
            System.out.println(count);
        }
    }
}
