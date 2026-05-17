//sum the price

import java.util.Scanner;
public class Product{
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
      

    double average = 0;
    int sum = 0;
    int count = 0;
    int total = 0;
    int price = 0;
    String  product = "";
    String reply  = "";

   

    while(true){

        System.out.print("Enter a product: ");
        product = input.next();
        input.nextLine();
        count ++;

        System.out.print("Please enter a price(#): ");
        price= input.nextInt();
        sum += price;

        System.out.print("Do you want to add more product? ");
        reply  = input.next().toLowerCase();


       

        if(reply.equals ("yes")){
            
            
            System.out.print("Enter a product: ");
            product = input.nextLine();
            input.nextLine();
            count ++;

            System.out.print("Please enter a price(#): ");
            price= input.nextInt();
            sum += price;
    
            
            System.out.print("Do you want to add more product? ");
            reply  = input.next().toLowerCase();
        }

   
        else{

            total = sum;
            average = total / count;
           break;
          
        }
          
    }

         System.out.println("Total: " + total)  ;  

         System.out.println("Average: " +average)  ;  
        
}

}


