import java.util.Arrays;
//import java.util.Scanner;
public class Loop{
public static void main(String[]args){

   System.out.println(add(2,3,4,5));
    
    System.out.println(multiply(2,3,4,5));

//    int[] numbers={2,3,4,5};
   System.out.println(Arrays.toString(getArray(2,3,4,5)));
}

    public static int add(int a, int b , int c, int d){
    int sum = a+ b+ c+ d;
    return sum;
}

      public static int multiply(int a, int b , int c, int d){
    int product = a* b*c* d;
    return product;
}
      public static int[] getArray(int a,int b, int c, int d){

            int[] result = {a,b,c,d};
//        for(int i = 0; i < numbers.length; i++){
//            result[i] = numbers[i];
//}
return result;
   }
    
}

//int sumofloop = 0;
//int secondloop=0;
//for(int i = 0;i<10;i++){
//sumofloop++;
//for (int j =0;j<5;j++){
//System.out.print(i);
//System.out.println("\t"+j);
//secondloop++;
//}
//}
//System.out.println("sum of first loop"+sumofloop);
//System.out.println("sum of seconf loop"+secondloop);
//}
//}

//    Scanner input = new Scanner(System.in);
//    
//    int[] arrayOfNumbers = new int[10];
//    for (int i = 0; i < 10; i ++){
//    System.out.print("Enter a number: ");
//    int number = input.nextInt();
//    arrayOfNumbers[i] = number;
//}
//  System.out.println(Arrays.toString(arrayOfNumbers));
//}
//}

    
    

//    int [] arrayOf = {2,4,3,6,7,6};
//
//    int sum = 0;
//    int product = 0;
//    for(int i = 0; i< arrayOf.length;i++){
//      System.out.println(i); 
//    sum += arrayOf[i];
//    product = arrayOf * i;
//}
// System.out.println("\n"+ Arrays.toString(arrayOf)); 
//    System.out.println("Sum is: " +sum) ;
//     System.out.println("Product is: " +product) ;
//}
//}
