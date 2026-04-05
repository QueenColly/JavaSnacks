import java.util.Scanner;

public class TaskThirty{
public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);
    System.out.print("Enter first integer; ");
    int nOne = inputCollector.nextInt();

    System.out.print("Enter second number; ");
    int nTwo = inputCollector.nextInt();

    int sum = nOne + nTwo;
    int product = nOne * nTwo;

    System.out.printf("Sum and Product is %d and %d.%n",sum,product);
}
  }


