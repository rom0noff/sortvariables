package project;

import java.util.Scanner;

public class Donik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Num1 ni kiriting");
        int num1 = scanner.nextInt();
        System.out.println("Num2 ni kiriting");
        int num2 = scanner.nextInt();
        System.out.println("Num3 ni kiriting");
        int num3 = scanner.nextInt();
        int max, middle, min;

        if (num1>num2) {
            max = num1;
            middle = num2;

        } else {
            max = num2;
            middle = num1;
        }


        if (num3>max) {
            min = middle;
            middle = max;
            max = num3;
        }else if(num3>middle){

        }
        System.out.println(max+", "+middle+", " + min);

    }
}