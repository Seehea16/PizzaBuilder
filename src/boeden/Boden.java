package boeden;

import PizzaBuilder.Groesse;
import PizzaBuilder.Teil;

public abstract class Boden implements Teil {
    
    @Override
    public abstract String name();
    
    public abstract Groesse groesse();
    
    @Override
    public abstract int gewicht();

    @Override
    public abstract double preis();    
}
