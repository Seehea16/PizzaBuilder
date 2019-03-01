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
    
    public void save(Pizza p) throws Exception{
        try(BufferedWriter writer = Files.newBufferedWriter(Paths.get(
                "src/resource/pizza.txt"), Charset.forName("UTF-8"))) {
            writer.write("Pizza;");
            writer.write(p.getName());
            for(Teil t : p.getTeile()) {
                writer.newLine();
                writer.write(t.name() + ";");
                if(t instanceof Boden) {
                    writer.write(((Boden) t).groesse().name() + ";");
                } else {
                    writer.write(((Belag) t).art() + ";");
                }
                writer.write(t.gewicht()+";");
                writer.write(t.preis()+"");
            }
        } catch (IOException ex) {
            System.out.println("Fehler beim Laden!");
            throw ex;
        }
    }
    
    public Pizza read() throws Exception {
        try(BufferedReader reader = Files.newBufferedReader(Paths.get(
                "src/resource/pizza.txt"), Charset.forName("UTF-8"))) {
            List<Teil> teile = new LinkedList<>();
            String currentLine = reader.readLine();
            String name = currentLine.split(";")[1];
            while((currentLine = reader.readLine()) != null) {
                String tokens[] = currentLine.split(";");
                switch(tokens[0]) {
                    case "Extraklein": teile.add(new Extraklein());
                        break;
                    case "Glutenfrei": teile.add(new Glutenfrei());
                        break;
                    case "Naturboden": teile.add(new Naturboden());
                        break;
                    case "Käse": teile.add(new Kaese());
                        break;
                    case "Salami": teile.add(new Salami());
                        break;
                    case "Schinken": teile.add(new Schinken());
                        break;
                    case "Thunfisch": teile.add(new Thunfisch());
                        break;
                    default: throw new Exception("");
                }
            }
            return new Pizza(teile, name);
        } catch (IOException ex) {
            System.out.println("Fehler beim Lesen!");
            throw ex;
        }
    }
}
