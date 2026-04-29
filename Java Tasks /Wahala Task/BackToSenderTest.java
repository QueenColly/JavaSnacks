package wahala;

public class BackToSenderTest {
    public static int calculateCommission(int successfulDelivery){
        double percentage = ((double) successfulDelivery /100) * 100;
        int amountPerParcel = 0;
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
        int commission = calculateCommission(80);

        System.out.println("commission is " + commission);
    }
}
