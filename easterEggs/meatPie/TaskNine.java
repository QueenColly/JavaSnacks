import java.util.Scanner;

    public class TaskNine{
    public static void main(String[] args) {
    
    Scanner inputCollector = new Scanner(System.in);
   
     System.out.println("What is your favourite color? ");
    String userInput = inputCollector.nextLine();
    
    System.out.printf("Hello Collete, your favourite color is %s. %n" , userInput );
 } 
}
