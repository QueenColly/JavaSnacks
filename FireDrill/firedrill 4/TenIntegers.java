import java.util.Scanner;

public class TenIntegers{
public static int[] store(int count){

    Scanner input = new Scanner(System.in);

    int[] array = new int [count];
   
    for (int index = 0; index< count; index++){
     System.out.print("Enter 10 numbers: ");

    int integer = input.nextInt();
     array[index] = integer;
}

    return array;
}

    public static void main(String[]args){
       int[] array = store(10);
        for(int index = 0; index < array.length; index++){
        System.out.print(index+ " ");
}

}
}
