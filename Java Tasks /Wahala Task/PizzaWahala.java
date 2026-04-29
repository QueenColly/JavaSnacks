package wahala;

public class PizzaWahala {
    public static void getPizza(int numberOfPeople, String pizzaType){
        int numberOfSlices = 0;
        int pricePerBox = 0;

        switch (pizzaType){
            case "Sapa size":
                numberOfSlices = 4;
                pricePerBox = 2500;
                break;
            case "Small Money":
                numberOfSlices = 6;
                pricePerBox = 2900;
                break;
            case "Big boys":
                numberOfSlices = 8;
                pricePerBox = 4000;
                break;
            case "Odogwu":
                numberOfSlices = 12;
                pricePerBox = 5200;
                break;
            default:
                System.out.println("invalid pizza");
                break;
        }

        int numberOfBoxes = (int) Math.ceil((double) numberOfPeople / numberOfSlices);
        double totalPrice = numberOfBoxes * pricePerBox;
        int remainingSlice = (numberOfSlices * numberOfBoxes) - numberOfPeople;

        System.out.println("Number of boxes of pizza to buy = " + numberOfBoxes + " boxes");
        System.out.println("Number left over slices after serving = " + remainingSlice +" slices");
        System.out.println("Price = " + totalPrice);
    }

    public static void main(String[] args) {
        PizzaWahala.getPizza(45, "Odogwu");
    }
}
