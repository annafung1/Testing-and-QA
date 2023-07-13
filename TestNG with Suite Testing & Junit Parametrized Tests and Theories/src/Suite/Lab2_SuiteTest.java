package Suite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.RETest;
import test.TraingleTest;

@RunWith(Suite.class)
@SuiteClasses({RETest.class, TraingleTest.class})
public class Lab2_SuiteTest {

}
