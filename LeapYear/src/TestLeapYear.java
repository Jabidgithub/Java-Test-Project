import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLeapYear {
    
   
    @Test
    public void TestLeapYear02(){

        App app = new App();
         assertEquals(App.leapYear(1998, true), false);

    }
    @Test
    public void TestLeapYear03(){

        App app = new App();
        assertEquals(App.leapYear(2016, false), false);

    }
    @Test
    public void TestLeapYear04(){

        App app = new App();
        assertEquals(App.leapYear(2020, false), false);

    }

    @Test
        public void TestLeapYear05(){

            App app = new App();
            assertEquals(App.leapYear(2026, false), false);

    }

}
