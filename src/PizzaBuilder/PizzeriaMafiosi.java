package PizzaBuilder;

import javax.swing.JOptionPane;

public class PizzeriaMafiosi {
    
    public static void main(String[] args) {
        PizzaBuilder builder = new PizzaBuilder();
        
        Pizza salami = builder.prepareSalamiPizza();
        System.out.println(salami.getName());
        salami.showTeile();
        System.out.println("Gesamtgewicht: " + salami.getGewicht() + "g");
        System.out.format("Gesamtpreis: %.2f€\n\n", salami.getPreis());
        
        Pizza schinken = builder.prepareSchinkenPizza();
        System.out.println(schinken.getName());
        schinken.showTeile();
        System.out.println("Gesamtgewicht: " + schinken.getGewicht() + "g");
        System.out.format("Gesamtpreis: %.2f€\n\n", schinken.getPreis());
        
        Pizza alTonno = builder.preparePizzaAlTonno();
        System.out.println(alTonno.getName());
        alTonno.showTeile();
        System.out.println("Gesamtgewicht: " + alTonno.getGewicht() + "g");
        System.out.format("Gesamtpreis: %.2f€\n\n", alTonno.getPreis());
        
        Pizza margarita = builder.preparePizzaMargarita();
        System.out.println(margarita.getName());
        margarita.showTeile();
        System.out.println("Gesamtgewicht: " + margarita.getGewicht() + "g");
        System.out.format("Gesamtpreis: %.2f€\n\n", margarita.getPreis());
    }
}
