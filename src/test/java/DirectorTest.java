import managment.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Fury", "SHIELD01", 150000.00, "Shield", 2000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Fury", director.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("SHIELD01", director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(150000.00, director.getSalary(),0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Shield", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(2000.00, director.getBudget(),0.1);
    }
}
