package tester;

import PizzaBuilder.Pizza;
import PizzaBuilder.PizzaBuilder;
import PizzaBuilder.Teil;
import belaege.Kaese;
import boeden.Glutenfrei;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LesenTest {
    
    PizzaBuilder builder;
    private int counter;
    private Teil t;
    
    public LesenTest(Teil t, int counter) {
        this.t = t;
        this.counter = counter;
    }
    
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
            {new Glutenfrei(), 1},
            {new Kaese(), 2},
            {new Kaese(), 3}
        };
        return Arrays.asList(data);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        builder = new PizzaBuilder();
    }
    
    @After
    public void tearDown() {
        builder = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testRead() {
        try {
            Pizza p = builder.read();
            if(counter == 1) {
                assertEquals("Wert in Zeile 0 unterschiedlich!", "Pizza Margarita", p.getName());
            }
            assertEquals("Wert in Zeile " + counter + " unterschiedlich!", 
                    t.name(), p.getTeile().get(counter-1).name());
        } catch(Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
