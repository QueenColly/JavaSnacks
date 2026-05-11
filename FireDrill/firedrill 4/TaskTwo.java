import java.util.Scanner;

public class TaskTwo{
public static int[] store(int count){

    Scanner input = new Scanner(System.in);

    int[] array = new int [count];
    System.out.print(count);

    for (int index = 0; index< count; index++){
    int integer = input.nextInt();
     array[index] = integer;
}
    return array;
}

    public static int[] reverseArray(int []array){
       int left = 0;
       int right = array.length - left - 1;

    while (left < right){
    int temp = array(left);
    newArray(left) = array(right);
    newArray[right] = temp;
    
    left++;
    right--;

}
        return newArray;
}

    public static void main(String[]args){
    int[] = {1,2,3,4,};
    int[] testArray = reverseArray(array);
        System.out.println(java.util.Arrays.toString(testArray));
}
}
