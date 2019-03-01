package belaege;

public class Salami extends Belag {

    @Override
    public String name() {
        return "Salami";
    }

    @Override
    public String art() {
        return "Regional";
    }

    @Override
    public int gewicht() {
        return 80;
    }

    @Override
    public double preis() {
        return 3.10;
    }
}
