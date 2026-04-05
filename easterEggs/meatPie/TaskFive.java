import java.util.Scanner;
public class TaskFive {
public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);
 System.out.print("Enter first integer: ");
    int number1 = inputCollector.nextInt();
 System.out.print("Enter second integer: ");
    int number2 = inputCollector.nextInt();
    int product = number1 * number2;
System.out.printf("Product is %d%n", product);

 }
}
