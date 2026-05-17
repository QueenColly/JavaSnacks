import java.util.Scanner;
public class TaskEight{
public static void main (String[] args){

    Scanner inputCollector = new Scanner (System.in);

    int sum = 0;
    
    for(int number = 1; number <= 10; number ++){
    System.out.print("Enter score " + number + ": ");
    int score = inputCollector.nextInt();
    if (score < 0){
        System.out.println("invalid score enter a number between 0 - 100");}
    if (score > 100){
       System.out.println("invalid score enter a number between 0 - 100");}
    sum += score;
    }
    

System.out.println("The sum of valid numbers is: " + sum);   



    }
}
   

    


