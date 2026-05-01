
public class EvenBoolean {  
  
  public static void main(String[] args){

    boolean even = isEven(4);
    System.out.println(even);
}
   
    public static boolean isEven(int number){

     if (number % 2 == 0){
    return true;
    } 
    else {
            return false;
            
       }
      // return number;
    }
 
}
