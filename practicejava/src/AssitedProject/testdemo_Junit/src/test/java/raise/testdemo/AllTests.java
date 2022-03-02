package raise.testdemo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AgeValidTest.class, AgeValidTest1.class })
public class AllTests {

}
