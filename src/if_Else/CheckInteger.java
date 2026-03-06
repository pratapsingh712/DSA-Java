package if_Else;

import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number :");
        double num = sc.nextDouble();

        // for natural numbers
        try{
            if(num<0){
                throw new IllegalArgumentException("Negative Number is not allowed !");
            }else{
                int x = (int)num;
                if(num-x==0){
                    System.out.println("Number is Integer :");
                }else{
                    System.out.println("Number is Double :");
                }
            }
        }catch (IllegalArgumentException e){
            System.out.println("Error : "+e.getMessage());
        }

        // for real numbers

        int numbers = (int) num;
        if(num-(numbers) == 0){
            System.out.println("It's a Integer :");
        }else {
            System.out.println("It's a Double :");
        }
    }
}
