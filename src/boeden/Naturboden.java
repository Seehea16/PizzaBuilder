package boeden;

import PizzaBuilder.Groesse;
import PizzaBuilder.Medium;

public class Naturboden extends Boden {
    
    @Override
    public String name() {
        return "Naturboden";
    }

    @Override
    public Groesse groesse() {
        return new Medium();
    }

    @Override
    public int gewicht() {
        return 250;
    }

    @Override
    public double preis() {
        return 1.50;
    }  
}
