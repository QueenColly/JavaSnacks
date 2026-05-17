import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        int score = 0;
        String evenScores = "";

        for (int number = 1; number <= 10; number++) {
            System.out.print("Enter score " + number + ": ");
            score = inputCollector.nextInt();

            if (score % 2 == 0) {
                evenScores += score + " ";
            }
        }
            if (evenScores.length() > 0){
        System.out.println("Even scores: " + evenScores);
        }   else {
            System.out.println("No even scores entered.");
        }
    }
}
