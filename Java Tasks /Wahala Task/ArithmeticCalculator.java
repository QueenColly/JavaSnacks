//import java.util.function.BinaryOperator;

public class ArithmeticCalculator{
public static void main(String[]args){

    double first = 4;
    double  second = 3;
    double result = getAddition(first,second);
    System.out.print(result);

   }
    public  static double getAddition(double first, double second){
        double addition = first + second;
        return addition;
}
    
}
