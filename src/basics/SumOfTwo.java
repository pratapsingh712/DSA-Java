package basics;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        System.out.print("Enter Third Number : ");
        int c = sc.nextInt();

        System.out.print("Sum of three number is : ");

        System.out.print(a+b+c);
    }
}
