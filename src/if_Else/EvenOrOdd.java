package if_Else;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive integer :");
        int num = sc.nextInt();

        try{
            if(num<0){
                throw new IllegalArgumentException("Negative Numbers are not allowed !");
            } else{
                if(num%2==0){
                    System.out.println("The Number you entered is even !");
                }if(num%2!=0){
                    System.out.println("The Number you entered is Odd");
                }
            }
        }catch(IllegalArgumentException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
