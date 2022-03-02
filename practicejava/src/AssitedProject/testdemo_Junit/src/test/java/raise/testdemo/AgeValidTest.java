package raise.testdemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AgeValidTest  {
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
    public void test1() {
   	 System.out.println("test1");
   	 assertEquals("he can vote",valid.Valid(25));
    }
    
    @Test
    public void test2() {
   	 System.out.println("test2");
   	 assertEquals("he can vote",valid.Valid(50));
    }
    @Test
    public void test3() {
    	System.out.println("test3");
    	assertEquals("he can vote",valid.Valid(34));
    }
    @Test
    public void test4()
    {
    	System.out.println("test4");
    	assertEquals("he can vote",valid.Valid(7));
    }
}
