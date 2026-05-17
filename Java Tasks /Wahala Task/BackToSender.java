
public class BackToSender{

    public int getWage(int numberOfDelivery, int basePay,int amountPerParcel){
        int amount = 0;
   // int numberOfDelivery = 10;
//     public int getwage(int numberOfDelivery, int basePay, int amountPerParcel){
        if( numberOfDelivery < 50){
//         numberOfDeliver = 10;
        amount = (10 * 160) + 5000;
            }

        if(numberOfDelivery > 50 && numberOfDelivery <= 59){
        amount = (51* 200) + 5000;
            }

        if(numberOfDelivery >= 60 && numberOfDelivery <=  69){
        amount = (61 * 250) + 5000;
            }

        if (numberOfDelivery >= 70){
        amount = ( 71 * 500) + 5000;
            }
          return amount;
}

    
    
}
