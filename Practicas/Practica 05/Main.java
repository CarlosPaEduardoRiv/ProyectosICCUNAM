public class Main {
    public static void main(String[] args) {

        FigurasGeometricas cuadrado = new Cuadrado(5);
        Cuadrado cuadrado2 = new Cuadrado(8);
        Rectangulo rectangulo = new Rectangulo(4.0, 6.0);
        Triangulo triangulo = new Triangulo(6.0, 5.0,4);

        System.out.println("\n" + cuadrado.toString());
        System.out.println("Área: " + cuadrado.areaDeFigura());
        System.out.println("Perímetro: " + cuadrado.perimetroDeFigura());

        System.out.println("\n" + cuadrado2.toString());
        System.out.println("Área: " + cuadrado2.areaDeFigura());
        System.out.println("Perímetro: " + cuadrado2.perimetroDeFigura());
        
        System.out.println("\n" + rectangulo.toString());
        System.out.println("Área: " + rectangulo.areaDeFigura());
        System.out.println("Perímetro: " + rectangulo.perimetroDeFigura());
        
        System.out.println("\n" + triangulo.toString());
        System.out.println("Área: " + triangulo.areaDeFigura());
        System.out.println("Perímetro: " + triangulo.perimetroDeFigura());
    }
}