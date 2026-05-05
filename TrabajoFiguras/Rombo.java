public class Rombo extends FiguraGeometrica {
    private double diagonal1;
    private double diagonal2;

    public Rombo(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double calcularArea() {
        return (diagonal1 * diagonal2) / 2;
    }
}