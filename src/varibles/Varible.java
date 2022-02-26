package varibles;

import java.util.Scanner;

public class Varible {
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
            max = num2;
            middle = num1;
        }
        if (num3 > max) {
            min = middle;
            middle = max;
            max = num3;
        }

        else if (num3 > middle) {
            min = middle;
            middle = num3;
        } else min = num3;
        System.out.println("3ta o'zgaruvchining kamayish tartibi:  " + max + ", "+ middle +", " + min);
        System.out.println("3ta o'zgaruvchining o'sish tartibi:  " + min + ", "+ middle +", " + max);
    }
}
