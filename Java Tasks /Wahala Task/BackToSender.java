package wahala;

import java.util.Scanner;

public class BackToSender {
    public static int calculateCommission(int successfulDelivery){
        double percentage = ((double) successfulDelivery /100) * 100;

        int amountPerParcel;
        int basePay = 5000;

        if (percentage < 50){
            amountPerParcel = 160;
        }else if(percentage >= 50 && percentage <= 59){
            amountPerParcel = 200;
        }else if(percentage >= 60 && percentage <= 69){
            amountPerParcel = 250;
        }else{
            amountPerParcel = 500;
        }

        return (successfulDelivery * amountPerParcel) + basePay;
    }

    public static void main(String[] args) {
        System.out.println("How many successful deliveries does the rider have today ?");

        Scanner scanner = new Scanner(System.in);

        int successfulDelivery = scanner.nextInt();

        int commission = BackToSender.calculateCommission(successfulDelivery);

        System.out.println("The rider's commision is "+ commission);
    }
}
