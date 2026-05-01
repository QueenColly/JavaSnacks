import java.util.Scanner;
public class TwoLargest{
public static void main(String[] args){

    Scanner input = new Scanner(System.in);

   int  largest = 0;
    int secondLargest = 0;
    for (int number = 1; number <= 10; number++){
        System.out.print("Enter 10 numbers : ");
        int integer = input.nextInt();

          if (largest < integer){
           secondLargest = largest;
         largest = integer;
             
//              System.out.println("Largest number is:"+ largest);
       }

        else if(secondLargest < integer){
            secondLargest = integer;
        }
}   
           
    System.out.println("Largest number is:"+ largest);
    System.out.println("Second largest number is:"+ secondLargest);
}
}
