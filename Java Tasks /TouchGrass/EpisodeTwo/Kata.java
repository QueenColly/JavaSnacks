 public class Kata {  
  
  public static void main(String[] args){

    boolean even = isEven(5);
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
