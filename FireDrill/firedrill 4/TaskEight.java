import java.util.Arrays;

public class TaskEight{
    public static void main(String[]args){

        int [] array = TwoSums.twoSum(new int[]{2,7,11,15}, 26);
        System.out.println(Arrays.toString(array));

    }
//        0  1  2   3  4 
//    [23, 2, 56, 7, 4], 11


//    initialize a new array of size 2
//    using a nexted forloop, loop through the array and hold the first value
//    Use that to compare the other values and repeat
//    if the values match the target, assign the indexes to the new array indexes
//    return new array    

    public static int[] twoSum (int [] array, int target){
        int newArray [] = new int[2];
        
        for(int index = 0; index < array.length; index++){
            for(int second = index + 1; second < array.length; second++ ){
                if(array[index] + array[second] == target){
                    newArray[0] = index;
                    newArray[1] = second;
                   return newArray;
                }

            }
        }
            return new int[0];
    }
}
