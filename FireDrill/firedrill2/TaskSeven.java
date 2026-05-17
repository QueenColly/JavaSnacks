import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        int score;
        String evenScores = "";
        int sum = 0;
        int count = 0;

        for (int number = 1; number <= 10; number++) {
            System.out.print("Enter score " + number + ": ");
            score = inputCollector.nextInt();

            if (score % 2 == 0) {
                evenScores += score + " ";
                sum += score;
                count++;
            }
        }

        System.out.println("Even scores: " + evenScores);
        

        if (count > 0) {
            double average =  sum / count;
            System.out.println("Average of even scores: " + average);
        } else {
            System.out.println("No even scores entered.");
        }
        System.out.println("The sum of even scores is: " + sum);
        
    }
}
