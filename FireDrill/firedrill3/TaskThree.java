import java.util.Scanner;
public class TaskThree{
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
  
//    int score = input.nextInt();
     int [] list =new int[10];
      System.out.println("Enter  scores: ");
    
//
//     for(int number = 0; number < list.length; number ++){
//        list[number] = input.nextInt();                                                             
//

    for(int number = 0; number < list.length; number ++){
        System.out.print("Enter a score "+number+ " :");
       list[number] = input.nextInt(); 
//     System.out.println(score);
     System.out.println(list[number]+ " ");

    }
    
   

    for(int number = 0; number < list.length; number++){
       
             System.out.print(list[number]+ " ");
  
 
}
   }
}

    

