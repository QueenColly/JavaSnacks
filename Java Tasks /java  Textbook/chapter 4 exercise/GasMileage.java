//write a program that will input the miles driven and gallons used (both as integers)for each trip
//after inputing your public class and public static void , import  scanner to collect user's input
//calculate the miles per gallon obtained for each trip
//
//then print the combined miles per gallon
//find the average of them and print your result in floating-point results
//use scanner and sentinel-controlled iteration to obtain the data from the user
//

import java.util.Scanner;
public class GasMileage{
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    int milesDriven = 0;
    int gallonsUsed = 0;
    int milesPerGallon = 0;
    int stop = -1;


        System.out.print("Enter miles driven: ");
        int miles = input.nextInt();

        System.out.print("Enter gallons used:");
        int gallons = input.nextInt();

        double average = miles / gallons;
        System.out.println("Average is: " + average);      
       
 
      while(milesDriven != -1) {
        System.out.print("Enter miles driven or -1 to exit: ");
        milesDriven = input.nextInt();
//        System.out.println("Average is: " + average);      

    }
//         System.out.println("Average is: " + average);
    
}
}
