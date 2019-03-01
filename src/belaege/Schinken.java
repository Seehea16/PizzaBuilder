package belaege;

public class Schinken extends Belag {

    @Override
    public String name() {
        return "Schinken";
    }

    @Override
    public String art() {
        return "Bein";
    }

    @Override
    public int gewicht() {
        return 120;
    }

    @Override
    public double preis() {
        return 3.50;
    }
}
