public class Cuadrado extends FigurasGeometricas {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double areaDeFigura() {
        return lado * lado;
    }

    @Override
    public double perimetroDeFigura() {
        return 4 * lado;
    }

    @Override
    public String toString() {
        return String.format("Cuadrado [Lado: %.2f]", lado);
    }
}