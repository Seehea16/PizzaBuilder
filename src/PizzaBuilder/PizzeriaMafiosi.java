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
        try {
            builder.save(salami);
            Pizza eingelesen = builder.read();
            System.out.println("Jetzt kommt die Eingelesene (Sollte gleich sein "
                    + "wie die darüberliegende): ");
            System.out.println(eingelesen.getName());
            eingelesen.showTeile();
            System.out.println("Gesamtgewicht: " + eingelesen.getGewicht() + "g");
            System.out.format("Gesamtpreis: %.2f€\n\n", eingelesen.getPreis());
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        Pizza schinken = builder.prepareSchinkenPizza();
        System.out.println(schinken.getName());
        schinken.showTeile();
        System.out.println("Gesamtgewicht: " + schinken.getGewicht() + "g");
        System.out.format("Gesamtpreis: %.2f€\n\n", schinken.getPreis());
        try {
            builder.save(schinken);
            Pizza eingelesen = builder.read();
            System.out.println("Jetzt kommt die Eingelesene (Sollte gleich sein "
                    + "wie die darüberliegende): ");
            System.out.println(eingelesen.getName());
            eingelesen.showTeile();
            System.out.println("Gesamtgewicht: " + eingelesen.getGewicht() + "g");
            System.out.format("Gesamtpreis: %.2f€\n\n", eingelesen.getPreis());
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        Pizza alTonno = builder.preparePizzaAlTonno();
        System.out.println(alTonno.getName());
        alTonno.showTeile();
        System.out.println("Gesamtgewicht: " + alTonno.getGewicht() + "g");
        System.out.format("Gesamtpreis: %.2f€\n\n", alTonno.getPreis());
        try {
            builder.save(alTonno);
            Pizza eingelesen = builder.read();
            System.out.println("Jetzt kommt die Eingelesene (Sollte gleich sein "
                    + "wie die darüberliegende): ");
            System.out.println(eingelesen.getName());
            eingelesen.showTeile();
            System.out.println("Gesamtgewicht: " + eingelesen.getGewicht() + "g");
            System.out.format("Gesamtpreis: %.2f€\n\n", eingelesen.getPreis());
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        Pizza margarita = builder.preparePizzaMargarita();
        System.out.println(margarita.getName());
        margarita.showTeile();
        System.out.println("Gesamtgewicht: " + margarita.getGewicht() + "g");
        System.out.format("Gesamtpreis: %.2f€\n\n", margarita.getPreis());
        try {
            builder.save(margarita);
            Pizza eingelesen = builder.read();
            System.out.println("Jetzt kommt die Eingelesene (Sollte gleich sein "
                    + "wie die darüberliegende): ");
            System.out.println(eingelesen.getName());
            eingelesen.showTeile();
            System.out.println("Gesamtgewicht: " + eingelesen.getGewicht() + "g");
            System.out.format("Gesamtpreis: %.2f€\n\n", eingelesen.getPreis());
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
}
