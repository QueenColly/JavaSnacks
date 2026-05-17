import java.util.Scanner;
public class TaskThree{
public static void main (String[] args){

    Scanner inputCollector = new Scanner (System.in);

    int sum = 0;
    double average = 0;
    
    for(int number = 1; number <= 10; number ++){
    System.out.print("Enter score " + number + ": ");
    double score = inputCollector.nextDouble();
    sum += score;
    average = sum/10;
    }
    
System.out.println("The sum of 10 scores : " + sum);   

System.out.println("The average of 10 scores : " + average);   



    }
}
   

    


 
