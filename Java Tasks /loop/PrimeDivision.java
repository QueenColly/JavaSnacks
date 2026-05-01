import java.util.Scanner;

public class PrimeDivision{
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();

//   int division = number /2;
//
//    int remainder = number % 2;
//    System.out.println("division" + division);
//    System.out.println("remainder" +remainder);
// 

    int count = 2;
    int total = 0;

    while( number != 1){
   if( number % count == 0){
     number = number/ count;
    total = total + count;
   
}
else 
   
   count++;
       
}
    System.out.println(total);
    
}
}

