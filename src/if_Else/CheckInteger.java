package if_Else;

import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number :");
        double num = sc.nextDouble();

        try{
            if(num<0){
                throw new IllegalArgumentException("Negative Number is not allowed !");
            }else{
                if(num%2==0.0 || num%2==1.0){
                    System.out.println("Number is integer :");
                }else{
                    System.out.println("Number is double :");
                }
            }
        }catch (IllegalArgumentException e){
            System.out.println("Error : "+e.getMessage());
        }


    }
}
