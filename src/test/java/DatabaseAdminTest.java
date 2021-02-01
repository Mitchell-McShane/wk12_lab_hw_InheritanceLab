import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Jim", "JH118897C", 21000);
    }

    @Test
    public void hasName(){
        assertEquals("Jim", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("JH118897C", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(21000, databaseAdmin.getSalary(),0.1);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(3000);
        assertEquals(24000, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(210.00, databaseAdmin.payBonus(),0.1);
    }
}

