import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BackToSenderTest{

    @Test
        public void riderDelivers10Parcels_wagesEarnedIs6600Test(){
              //given
                int numberOfDelivery = 10;
              //when
                BackToSender backToSender = new BackToSender();
                int actual = backToSender.getWage(numberOfDelivery,5000,160);
              //Expected
                int result = 6600;
                assertEquals(actual,result);
        }

    @Test
        public void riderDelivers51Parcels_wagesEarnedIs15200Test(){
              //given
                int numberOfDelivery = 51;
              //when
                BackToSender backToSender = new BackToSender();
                int actual = backToSender.getWage(numberOfDelivery,5000,200);
              //Expected
                int result = 15200;
                assertEquals(actual,result);
        }

    @Test
        public void riderDelivers61Parcels_wagesEarnedIs20250Test(){
              //given
                int numberOfDelivery = 61;
              //when
                BackToSender backToSender = new BackToSender();
                int actual = backToSender.getWage(numberOfDelivery,5000,250);
              //Expected
                int result = 20250;
                assertEquals(actual,result);
        }
    @Test
        public void riderDelivers71Parcels_wagesEarnedIs40500Test(){
              //given
                int numberOfDelivery = 71;
              //when
                BackToSender backToSender = new BackToSender();
                int actual = backToSender.getWage(numberOfDelivery,5000,500);
              //Expected
                int result = 40500;
                assertEquals(actual,result);
        }

}
