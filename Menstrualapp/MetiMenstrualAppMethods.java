import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class MetiMenstrualAppMethods{
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.print("Please enter your name: ");
    String name = input.nextLine();

    System.out.print("Are you using meti for yourself? Y/N: ");
    String usage = input.nextLine();
    

    System.out.print("Please enter your year of birth (yyyy): ");
     int year = input.nextInt();

    System.out.print("Who recommended Meti to you: ");
    String recommendation = input.next();
        
    //1.. last period
    DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    System.out.println("Please enter your last period date (dd-MM-yyyy): ");
    String lastPeriod = input.next();

    LocalDate  collectedDate = LocalDate.parse(lastPeriod, myFormat);
    

   

    //3. period duration
    System.out.println("Please enter period duration: ");
    int periodDuration = input.nextInt();

    // App Calculator

        

       LocalDate nextPeriodDate = collectedDate.plusDays(cycleLength);

       LocalDate ovulationDate = nextPeriodDate.minusDays(14);
       LocalDate fertileStart = ovulationDate.minusDays(5);
       LocalDate fertileEnds = ovulationDate.plusDays(1);

       LocalDate periodEnd = collectedDate.plusDays(periodDuration);

       


        System.out.println("Next period is " + nextPeriodDate );
//        System.out.println(ovulation );
//        System.out.println(fertileStart );
//        System.out.println(fertileEnds );
//        System.out.println(periodEnd );

//         System.out.println("Hello"+" "+ name +);


    }

    public static 
}




