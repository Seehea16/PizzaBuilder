package boeden;

import PizzaBuilder.Groesse;
import PizzaBuilder.Small;

public class Extraklein extends Boden {
    
    @Override
    public String name() {
        return "Extraklein";
    }

    @Override
    public Groesse groesse() {
        return new Small();
    }

    @Override
    public int gewicht() {
        return 170;
    }

    @Override
    public double preis() {
        return 1.30;
    }  
}
