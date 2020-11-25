package assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;

//import java.io.*;


public class Tests {


   @Test
   public void code(){
       App.main(null);
       assertEquals(false, App.passwordCheck("fegfqoweg"), "ERROR");
       assertEquals(false, App.passwordCheck("efwgbwwg"), "ERROR");
       assertEquals(false, App.passwordCheck("3456i4u"), "ERROR");
       assertEquals(true, App.passwordCheck("Knights42"), "ERROR");
   }

   @Test
    public void late() {
        App.main(null);
        assertTrue(DueDate.onTime(2021, 1, 8), "Submitted Late");
    }

}
