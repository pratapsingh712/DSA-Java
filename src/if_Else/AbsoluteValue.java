package if_Else;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = sc.nextInt();

        if(num<0){
            num = -num;
//            System.out.println("Num is : "+num);
        }//else{
//            System.out.println("Num is : "+num);
//        }

            System.out.println("Num is : "+num);
    }
}
