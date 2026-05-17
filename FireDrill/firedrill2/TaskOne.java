import java.util.Scanner;
public class TaskOne{
public static void main (String[] args){

    Scanner inputCollector = new Scanner (System.in);

    int sum = 0;
    
    for(int number = 1; number <= 10; number ++){
    System.out.print("Enter score " + number + ": ");
    int score = inputCollector.nextInt();
    sum += score;
    }
    

System.out.println("The sum of 10 numbers : " + sum);   



    }
}
   

    


