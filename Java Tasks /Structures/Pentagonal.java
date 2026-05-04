// loop from 1-100
// 

public class Pentagonal{
public static void main(String[] args){

    System.out.println("The nth value of a pentagonal is "+ getPentagnalNumber(100));
    System.out.println("The sum of digit is "+ sumDigits(11111));
    System.out.println("area of pentagon is " +area(5));
    

}

    public static int getPentagnalNumber(int n){
        int number = 0;
        int counter = 0;

       
        for(int index = 1; index <= n; index++){
            number = (index * ((3* index) - 1)) /2;

            System.out.printf("%7d", number);
            counter++;

            if(counter == 10){
                System.out.println();
                counter = 0;
            }
        
        }
            return number;
   
   }


    public static int sumDigits (long n){  //question 2
    
    int sum = 0;
    while(n > 0){
        sum += n % 10;
        n = n / 10;
    }
    return sum;
    

}
    public static double area(double side){ // question 24
    int s = 5;
    double area = ((5 * s*s)/(4 * 0.7265));
    return area;

}

}


