/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import PizzaBuilder.Pizza;
import PizzaBuilder.PizzaBuilder;
import belaege.Belag;
import boeden.Boden;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author lukas
 */
@RunWith(Parameterized.class)
public class ErstellenTest {
    
    PizzaBuilder builder;
    String name, eigenschaft;
    double preis;
    int gewicht, counter;
    
    public ErstellenTest(String name, String eigenschaft, int gewicht, 
            double preis, int counter) {
        this.name = name;
        this.eigenschaft = eigenschaft;
        this.gewicht = gewicht;
        this.preis = preis;
        this.counter = counter;
    }
    
    @Parameterized.Parameters
    public static Collection<Object[]> data()
    {
        Object[] [] data = new Object [] []
        {
            {"Naturboden", "Medium", 250, 1.50, 0},
            {"Salami", "Regional", 80, 3.10, 1},
            {"Käse", "Bio", 100, 2.50, 2}
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
    public void testErzeugen() {
        Pizza p = builder.prepareSalamiPizza();
        if(counter == 0) {
            assertEquals("Name ungleich!", "Salami-Pizza", p.getName());
            assertEquals("Gewicht ungleich!", "430", p.getGewicht()+"");
            assertEquals("Gesamtpreis ungleich!", 7.10, p.getPreis(), 0.01);
        }
        assertEquals("Name an " + (counter+1) + ". Stelle in Liste falsch!", 
                this.name, p.getTeile().get(counter).name());
        if(p.getTeile().get(counter) instanceof Boden) {
            assertEquals("Größe an " + (counter+1) + ". Stelle in Liste falsch!", 
                this.eigenschaft, ((Boden) (p.getTeile().get(counter))).groesse().name());
        } else {
            assertEquals("Art an " + (counter+1) + ". Stelle in Liste falsch!", 
                this.eigenschaft, ((Belag) (p.getTeile().get(counter))).art());
        }
        assertEquals("Gewicht an " + (counter+1) + ". Stelle in Liste falsch!", 
                this.gewicht, p.getTeile().get(counter).gewicht());
        assertEquals("Preis an " + (counter+1) + ". Stelle in Liste falsch!", 
                this.preis, p.getTeile().get(counter).preis(), 0.01);
    }
}
