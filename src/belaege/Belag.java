package belaege;

import PizzaBuilder.Teil;

public abstract class Belag implements Teil {
    
    @Override
    public abstract String name();
    
    public abstract String art();
    
    @Override
    public abstract int gewicht();

    @Override
    public abstract double preis();    
}
