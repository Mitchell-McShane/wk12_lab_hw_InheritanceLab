import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Ken", "JH345522B", 15000);
    }

    @Test
    public void hasName(){
        assertEquals("Ken", developer.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("JH345522B", developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(15000, developer.getSalary(),0.1);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(3000);
        assertEquals(18000, developer.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(150.00, developer.payBonus(),0.1);
    }
}
