import java.util.Scanner;

public class Negatives{
public static void main(String[] args){

            int numberofInputs = 0;
            double numberSumation = 0;

    while(true) {
               
             Scanner scanner = new Scanner(System.in);

                System.out.println("Enter a number: ");
                int numberInputed = scanner.nextInt();
                if (numberInputed < 0){
                    break;
                  }

        numberOfInputs = numberOfInputs + 1;
                    numberSum = numberSum + numberInput;
             }

                if (numberOfInputs == 0){
                    System.out.println("The average of the number is: ");
                }

                    System.out.printlm("The average of the numbers:" + numberSum/numberOfInput);

         }
      }
