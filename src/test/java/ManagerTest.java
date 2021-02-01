import managment.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Mitch", "NI223306A", 41437, "IT");
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(3500);
        assertEquals(44937, manager.getSalary(), 0.01);
    }

    public void canPayBonus(){
        assertEquals(500, manager.payBonus(), 0.01);
    }

}
