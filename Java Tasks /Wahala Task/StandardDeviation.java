import java.util.Arrays;
//
public class StandardDeviation{
public static void main (String[] args){

    int[] arrays = {2,4,6,8,10};
    int lengthOfArrray = arrays.length;
int sumOfAllValuesInArray = getSumss(arrays);
    System.out.println(sumOfAllValuesInArray);

    System.out.println(getMean(sumOfAllValuesInArray,lengthOfArrray));

    System.out.println(getMeanBar(lengthOfArrray));
}

    public static int  getSumss(int []arrays){
    int sum =0;
   // int count = 0;

    for (int index = 0; index < arrays.length;index++ ){
        sum += arrays[index];
          //  count++;
        
    }
         return sum;
}
    public static int getMean(int sum,int  arrays){
    int  mean = sum/arrays;
    return mean;
}  
    
    public static int[] getMeanBar(int []arrays, int mean){

    int[] second = new int[arrays.length];

    for(int index = 0; index < arrays.length; index++ ){
    int subtraction = array[index] - mean;
    second[index] = subtraction;
    
}
    return second;
}
    public static int [] gettwice(){int[] second  }{

        for(int index = 0;index < second.length; index++){
           int  multiplication =  second(index) * second(index){
    
            sum += second[index];
         }
            }
             return sum; 
        }
     }       
}

    





















//
//Horizons!
//
//Go home with this
//
//Write a program that calculates the standard deviation of a set of numbers
//*WRITE TESTS*
//*WRITE TESTS*
//*WRITE TESTS*
//*WRITE TESTS*
//*WRITE TESTS*
//*WRITE TESTS*
//*WRITE TESTS*
//
//@33011806511240  @107709324128328 AS UNA NO DEY SEE!!
//
//Deadline: 14th May 2026, 12:00am
//
//Abi we should do earlier
//
//
//    int[] arrays = {2,4,6,8,10};
//    int[] numbers = new int [5];
//
//    int count =0;
//    for(int index = arrays.length - 1; index >= 0; index--){
//
//    numbers[count]= 0;//arrays[index];
//        count++;
//    //System.out.print(index + " ");
//   // System.out.println();
//  
//     System.out.println(Arrays.toString(numbers));
//}
//     
//  
//}
//}
//














