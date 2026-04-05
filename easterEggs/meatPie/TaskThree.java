import java.util.Scanner;
public class TaskThree {
public static void main(String[] args){

   Scanner inputCollector = new Scanner(System.in);
 System.out.print("Enter first integer: ");
  int numberOne = inputCollector.nextInt();
 System.out.print("Enter second integer: ");
  int numberTwo = inputCollector.nextInt();
  System.out.print("Enter third integer:");
  int numberThree = inputCollector.nextInt();
  int sum = numberOne + numberTwo + numberThree;
 System.out.printf("Sum is %d%n", sum);
}
  }
