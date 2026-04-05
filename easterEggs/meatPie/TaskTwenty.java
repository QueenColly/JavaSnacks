import java.util.Scanner;
public class TaskTwenty{
public static void main(String[] args) {

    Scanner inputCollector = new Scanner(System.in);
    System.out.print("Enter length: ");
    int l = inputCollector.nextInt();
    
    System.out.print("Enter width: ");
    int w= inputCollector.nextInt();

    int multiply = l * w;
    int area = multiply;

    System.out.printf("Area is: %d%n", area);
}
  }
