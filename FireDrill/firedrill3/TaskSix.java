import java.util.Arrays;
public class TaskSix {
public static void main(String[] args){
//}

int[] numbers = {2,1,5,7,8};
System.out.println(Arrays.toString(getOddArray(numbers)));
}


    public static int[] getOddArray(int [] numbers){
    int sum =0;
    int [] result =new int[numbers.length];

    for(int index = 0; index < numbers.length; index++){
        if(numbers[index] % 2 ==0){

         result[index]= numbers[index];
        sum += result[index];
        

        }       

    
    }
  return sum;

    }
}
