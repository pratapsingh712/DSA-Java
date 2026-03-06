package if_Else;

import java.util.Scanner;

public class ProfitAndLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Buying Price of an Item : ");
        double buying_Price = sc.nextDouble();

        System.out.println("Enter the selling price of an Item : ");
        double selling_Price = sc.nextDouble();

        if(selling_Price - buying_Price > 0){
            // made profit
            System.out.println("You have made profit of "+(selling_Price-buying_Price));
        } else if (selling_Price - buying_Price < 0) {
            // made loss
            System.out.println("You have mode loss of "+(selling_Price-buying_Price));
        } else if(selling_Price - buying_Price== 0){
            // no profit no loss
            System.out.println("Made No profit and No loss : ");
        }
    }
}
