public class OshoFreePromoEngine{

    public static void main(String[] args){
        double result = getFinalPrice(3000,"NOT APPLICABLE");
        System.out.println(result);
    }   

    public static double getFinalPrice(double cartTotal, String promoCode){
        double finalPrice = 0;
        double promoValue = 0.0;

        if(cartTotal < 5000 && promoCode.equals("NOT APPLICABLE")){
            promoValue = 0.0;
        }
        if (cartTotal >=5000 && cartTotal <= 14999 && promoCode.equals("STARTER10")){
            promoValue = 0.1;
            System.out.println(promoValue);
        }
        if(cartTotal >= 15000 && cartTotal <= 29999 && promoCode.equals("BIGBOY20")){
            promoValue = 0.2;
            System.out.println(promoValue);
        }

        if(cartTotal>=30000 && promoCode.equals("OSHOFREE35")){
            promoValue = 0.35;
            System.out.println(promoValue);
        }

        double discountAmount = cartTotal * promoValue;
        finalPrice = cartTotal - discountAmount;
        
        return finalPrice;

    }


}
