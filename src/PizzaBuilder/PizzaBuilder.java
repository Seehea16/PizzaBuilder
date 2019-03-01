package PizzaBuilder;

import belaege.Belag;
import belaege.Kaese;
import belaege.Salami;
import belaege.Schinken;
import belaege.Thunfisch;
import boeden.Boden;
import boeden.Extraklein;
import boeden.Glutenfrei;
import boeden.Naturboden;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class PizzaBuilder {
    
    public Pizza prepareSalamiPizza() {
        Pizza pizza = new Pizza("Salami-Pizza");
        pizza.addTeil(new Naturboden());
        pizza.addTeil(new Salami());
        pizza.addTeil(new Kaese());
        return pizza;
    }
    
    public Pizza prepareSchinkenPizza() {
        Pizza pizza = new Pizza("Schinken-Pizza");
        pizza.addTeil(new Extraklein());
        pizza.addTeil(new Schinken());
        pizza.addTeil(new Kaese());
        return pizza;
    }
    
    public Pizza preparePizzaAlTonno() {
        Pizza pizza = new Pizza("Pizza Al Tonno");
        pizza.addTeil(new Naturboden());
        pizza.addTeil(new Thunfisch());
        pizza.addTeil(new Kaese());
        return pizza;
    }
    
    public Pizza preparePizzaMargarita() {
        Pizza pizza = new Pizza("Pizza Margarita");
        pizza.addTeil(new Glutenfrei());
        pizza.addTeil(new Kaese());
        pizza.addTeil(new Kaese());
        return pizza;
    }
}
