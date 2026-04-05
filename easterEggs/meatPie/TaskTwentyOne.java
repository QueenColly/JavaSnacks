import java.util.Scanner;
public class TaskTwentyOne{
public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);
    
    System.out.printf("Enter base of triangle:");
    int base = inputCollector.nextInt();

    System.out.printf("Enter height of triangle:");
    int height = inputCollector.nextInt();

    int multiply = base * height ;
    int area= multiply/2;

    System.out.printf("Area is: %d%n ", area);
}
}
