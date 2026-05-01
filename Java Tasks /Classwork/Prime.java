//import java.util.Scanner;

public class Prime{
public static void main(String[] args){
//Scanner input = new Scanner(System.in);
//
//System.out.print("Enter an interger: ");
//int numbers = input.nextInt();
//
//boolean isPrime = true;
//
//if(numbers <= 1 ){
//isPrime = false;
//}
// else {
//for(int index = 2; index < numbers / 2; index++){
//    if(numbers % index == 0){
//        isPrime = false;
//           break;
//}
//}
//    }
//if(isPrime){
//System.out.println(numbers + " is a prime number");
//}else{
//System.out.println(numbers + " is not a prime number");
//}
//}
//} collecting user input to print prime numbers 

//    int value = 0
//for (number = 2; number <= 20; number ++){
//    if( value = number / primenumber  ){
        int sum = 0;
     for(int count = 2; count <= 50; count++ ){
           int check = 0;
        for(int counter = 1; counter <= count; counter++){
                if(count % counter == 0) check += 1;
        }
        
        if(check == 2){
            sum += count;
            System.out.println(count);
            }
            

        }
                       System.out.println(sum);
       } 
    }
