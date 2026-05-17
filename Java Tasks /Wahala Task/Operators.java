public class Operators{
    public static void main(String [] args){

    java.util.Scanner input = new java.util.Scanner(System.in);

System.out.print("Enter number  from 1 - 4: ");
int arithmetic = input.nextInt();

switch (arithmetic){

case 1: System.out.print("Enter number ");
        int number1 = input.nextInt();
        System.out.print("Enter number ");
        int number2 = input.nextInt();
        
        int add = number1 + number2;

        System.out.println(add);
        break;
        
case 2: System.out.print("Enter number ");
        int numberOne = input.nextInt();
        System.out.print("Enter number ");
        int numberTwo = input.nextInt();

        int sub = numberOne - numberTwo;


        System.out.println(sub);
        break;

default: System.out.println("Invalid input");

}

}














}
