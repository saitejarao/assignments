package raise.testdemo;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AgeValidTest1 {

    Agevalidator valid;
    @Before
    public void objintializer() {
   	 
   	 valid=new Agevalidator();
   	 System.out.println("obj created");
    }
    
    @After
    public void objdestroy() {
   	 valid=null;
   	 System.out.println("obj destroyed");
    }
    
    
    @Test
    public void test5() {
   	 System.out.println("test5");
   	 assertEquals("he cannot vote",valid.Valid(5));
    }
}
