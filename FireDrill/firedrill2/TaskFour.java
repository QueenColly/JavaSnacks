import java.util.Scanner;
public class TaskFour{
public static void main (String[] args){

    Scanner inputCollector = new Scanner (System.in);

    int sum = 0;
    
    
    for(int number = 1; number <= 10; number ++){
    System.out.print("Enter score " + number + ": ");
    double score = inputCollector.nextDouble();
  
    if (number % 2 == 0){   
     sum += score;
   } 

}
System.out.println("The sum of index scores : " + sum); 

    }
}
   

    


 
