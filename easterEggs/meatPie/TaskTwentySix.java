import java.util.Scanner;
public class TaskTwentySix{
public static void main (String[] args ){

    Scanner inputCollector = new Scanner(System.in);
    System.out.println("What is your name?");
    String userInput = inputCollector.nextLine();

    System.out.println("How old are you?");
    int age = inputCollector.nextInt();

    System.out.printf("I am %s, and I am %d years old.%n", userInput,age) ;
    
}
}
