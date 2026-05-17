import java.util.Scanner;
public class Products{
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
      
    

    System.out.print("Please enter a price(#): ");
    int price= input.nextInt();

   do{
              
        System.out.print("Enter a product: ");
       String  product = input.nextLine();
       input.nextLine();

       System.out.print("Do you want to add more product? ");
       String reply  = input.nextLine().toLowerCase();

        
   if(reply.equals ("yes")){     
    System.out.print("Please enter a price(#): ");
       price = input.nextInt();
        
   }
           else{
    break;
}
}
            

    while(true)  ;    

     


        }

    }







