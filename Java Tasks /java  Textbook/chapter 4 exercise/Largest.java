//declare class and main method , then import scanner  
//
//initialise your variable to an object largest = 0
//using the for loop , initialise number to be 0 , then set your condition to be <= 10, input your increment
//let your for loop have a statement that allows user to input numbers 
//
//set your largest to be > number  and largest to  be = number 
//
//print largest


import java.util.Scanner;
public class Largest{
public static void main(String[] args){

    Scanner input = new Scanner(System.in);

   int  largest = 0;

    for (int number = 1; number <= 10; number++){
        System.out.print("Enter 10 numbers : ");
        int integer = input.nextInt();

          if (largest < integer){
        largest = integer;
             
            }
       }
           
    System.out.println("Largest number is:"+ largest);
}
}
