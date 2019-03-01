package belaege;

public class Thunfisch extends Belag {

    @Override
    public String name() {
        return "Thunfisch";
    }

    @Override
    public String art() {
        return "Frisch";
    }

    @Override
    public int gewicht() {
        return 70;
    }

    @Override
    public double preis() {
        return 2.90;
    }
}
