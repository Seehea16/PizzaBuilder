package belaege;

public class Kaese extends Belag {

    @Override
    public String name() {
        return "Käse";
    }

    @Override
    public String art() {
        return "Bio";
    }

    @Override
    public int gewicht() {
        return 100;
    }

    @Override
    public double preis() {
        return 2.50;
    }
}
