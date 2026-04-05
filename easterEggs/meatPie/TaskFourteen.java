import java.util.Scanner;
public class TaskFourteen{
public static void main(String[] args) {

    Scanner inputCollector = new Scanner(System.in);
    System.out.printf("Enter first integer:"); 
    int numberOne = inputCollector.nextInt();

    System.out.printf("Enter second integer:");
    int numberTwo = inputCollector.nextInt();

    System.out.printf("Enter third integer:");
    int numberThree = inputCollector.nextInt();

    int sum = numberOne + numberTwo + numberThree ;
    int average = sum / 3;

    System.out.printf("Average is %d%n", average);
}
}

