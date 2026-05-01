public class Numbers{
public static void main(String[] args){

        int number = 1;
        while(number <= 100 ; number ++){

             if (number % 2 == 0 ){
               System.out.print(number + "Even" + "\n");
                number--;
}

             if (number % 2 != 0){
                System.out.print(number + "Odd" + "\n");
                 number--;
}

            else if(number % 4 == 0){
                System.out.print(number + "Hurray!!!" + "\n");
                  number--;
}

}
}
}
