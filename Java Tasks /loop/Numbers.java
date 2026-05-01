public class Numbers{
public static void main(String[] args){

    for (int number  = 1; number <= 100 ; number++){
         

    if ( number % 2 == 0){
         System.out.println(number + " even" + "\n");
       } 
            else if (number % 2 != 0){
              System.out.println(number + " odd" + "\n");
            }
 
    if(number % 4 != 0){
        System.out.println( number + " Hurray" + "\n");
    }       
             
   }      
  }
}
