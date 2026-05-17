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

    for (int index = 0; index < arrays.length;index++ ){
        sum += arrays[index];
          
                }
         return sum;
}
    public static int getMean(int sum,int  arrayLength){
        int  mean = sum/arrayLength;
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

        int [] third = new int[second.length];
        for(int index = 0;index < second.length; index++){
           int  multiplication =  second(index) * second(index);
    
            third[index ]= multiplication;
         }
            }
             return third; 
        
}  


    public static int [] sumResultInNewArray(int sum, int[]third){

        int sum = 0;
    for (int index =0;index< third.length; index++){
            sum += third[index];
    }

            return sum;
}     

    public static int[] getvariance(int sum, int lengthOfArrray){

        for 
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














