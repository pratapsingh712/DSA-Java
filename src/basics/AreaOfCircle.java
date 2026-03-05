package basics;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        // Area of triangle

//        double r = 8.5;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius : ");

        double r = sc.nextDouble();

        double area = 3.141592 * r * r;

        System.out.print("Area is : ");
        System.out.print(area);
    }
}
