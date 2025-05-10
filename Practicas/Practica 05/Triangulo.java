public class Triangulo extends FigurasGeometricas {

    // suponiendo que se pide para un triangulo isosceles
    private double base;
    private double ladoIgual;
    private double altura;


    public Triangulo(double base, double ladoIgual, double altura) {
        this.base = base;
        this.ladoIgual = ladoIgual;
        this.altura = altura;
    }

    @Override
    public double areaDeFigura() {
        return (base * altura) / 2;
    }

    @Override
    public double perimetroDeFigura() {
        return base + (2 * ladoIgual);
    }

    @Override
    public String toString() {
        return String.format("Triángulo Isósceles [Base: %.2f, Lados iguales: %.2f]", base, ladoIgual);
    }
}