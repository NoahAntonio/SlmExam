
package at.technikum.slmexam;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
public class DigitCalculatorController {


    @Test
    void getSumTest(){
        int i = 1234;
        assertEquals(10,DigitCalculatorController.digitSum(i));
    }


}

