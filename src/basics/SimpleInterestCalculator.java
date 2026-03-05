package basics;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal amount : ");
        double principal_Amount = sc.nextDouble();

        System.out.println("Enter Rate of Interest : ");
        double rate_Interest = sc.nextDouble();

        System.out.println("Enter the Time Perioud : ");
        double time_Period = sc.nextDouble();

        double simple_Interest = principal_Amount*rate_Interest*time_Period/100;

        System.out.println("Interest Earned is = "+simple_Interest);
    }
}
