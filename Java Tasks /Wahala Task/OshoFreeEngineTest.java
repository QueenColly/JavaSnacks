import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OshoFreeEngineTest{

    @Test
    public void testThatBIGBOY20_promoCodeDiscountWorks(){
//        given
        double price = 15000;
//        actual
        double result = OshoFreePromoEngine.getFinalPrice(price, "BIGBOY20");
//        expected
        double finalPrice = 12000;
        assertEquals(finalPrice, result);
        
    }
   @Test
    public void testThatSTARTER10_promoCodeDiscountWorks(){
//        given
        double price = 13000;
//        actual
        double result = OshoFreePromoEngine.getFinalPrice(price,"STARTER10");
//        expected
        double finalPrice = 11700;
        assertEquals(finalPrice, result);
        
    }
 @Test
    public void testThatOSHOFREE_promoCodeDiscountWorks(){
//        given
        double price = 30000;
//        actual
        double result = OshoFreePromoEngine.getFinalPrice(price,"OSHOFREE35");
//        expected
        double finalPrice = 19500;
        assertEquals(finalPrice, result);
        
    }

@Test
    public void testThatNOTAPPLICABLE_promoCodeDiscountWorks(){
//        given
        double price = 3000;
//        actual
        double result = OshoFreePromoEngine.getFinalPrice(price,"NOT APPLICABLE");
//        expected
        double finalPrice = 3000;
        assertEquals(finalPrice, result);
        
    }




    

}
