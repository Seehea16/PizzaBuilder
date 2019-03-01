package PizzaBuilder;

import belaege.Belag;
import boeden.Boden;
import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private List<Teil> teile;
    private String name;

    public Pizza(String name) {
        teile = new ArrayList<>();
        this.name = name;
    }

    public Pizza(List<Teil> teile, String name) {
        this.teile = teile;
        this.name = name;
    }
    
    public void addTeil(Teil teil) {
        teile.add(teil);
    }
    
    public double getPreis() {
        double preis = 0;
        
        for(Teil teil : teile) {
            preis += teil.preis();
        }
        
        return preis;
    }
    
    public int getGewicht() {
        int gewicht = 0;
        
        for(Teil teil: teile) {
            gewicht += teil.gewicht();
        }
        
        return gewicht;
    }
    
    public void showTeile() {
        for(Teil teil : teile) {
            if(teil instanceof Boden) {
                System.out.print("Boden: " + teil.name());
                System.out.print(", Größe: " + ((Boden) teil).groesse().name());
            } else {
                System.out.print("Belag: " + teil.name());
                System.out.print(", Art: " + ((Belag) teil).art());
            }
            System.out.print(", Gewicht: " + teil.gewicht() + "g");
            System.out.format(", Preis: %.2f€\n", teil.preis());
        }
    }

    public String getName() {
        return name;
    }

    public List<Teil> getTeile() {
        return teile;
    }
}
