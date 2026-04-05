import java.util.Scanner;

public class TaskFour {
public static void main(String[] args) {

    Scanner inputCollector = new Scanner(System.in);

    System.out.printf("Enter first integer: ");    
    int numberOne = inputCollector.nextInt();

    System.out.printf("Enter second integer: ");
    int numberTwo = inputCollector.nextInt();

    int difference = numberOne - numberTwo;
    System.out.printf("Difference is %d%n", difference );



  }
} 
