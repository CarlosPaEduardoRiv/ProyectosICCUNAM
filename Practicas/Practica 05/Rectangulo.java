public class Rectangulo extends FigurasGeometricas {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double areaDeFigura() {
        return base * altura;
    }

    @Override
    public double perimetroDeFigura() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return String.format("Rectángulo [Base: %.2f, Altura: %.2f]", base, altura);
    }
    
}