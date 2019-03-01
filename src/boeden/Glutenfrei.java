package boeden;

import PizzaBuilder.Groesse;
import PizzaBuilder.Large;

public class Glutenfrei extends Boden {
    
    @Override
    public String name() {
        return "Glutenfrei";
    }

    @Override
    public Groesse groesse() {
        return new Large();
    }

    @Override
    public int gewicht() {
        return 230;
    }

    @Override
    public double preis() {
        return 1.70;
    }  
}
