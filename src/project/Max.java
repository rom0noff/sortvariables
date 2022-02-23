package project;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter num3: ");
        int num3 = scanner.nextInt();
        int max, min, middle;
        if (num1 > num2) {
            max = num1;
            middle = num2;
        } else {
            max = num2; //15
            middle = num1; //5
        }
            //10   15
        if (num3 > max) {
            min = middle;
            middle = max;
            max = num3;
        }
//        else{min = middle; middle = num3;}
        else if (num3 > middle) {
            min = middle;
            middle = num3;
        } else min = num3;
            System.out.println( max + ", "+ middle +", " + min);
    }
}
