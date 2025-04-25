public class Recipiente {
    
    private int radio;
    private double altura;
    private double volumen;
    private double contenido;

    public Recipiente(double altura, int radio) {
        if (altura <= 0 || radio <= 0) {
            System.out.println("La altura y el radio deben ser positivos.");
        }
        this.radio = radio;
        this.altura = altura;
        this.contenido = 0.0;
        this.volumen = (radio * radio * Math.PI) * altura;;
    }

    public double capacidad() {
        return volumen;
    }

    public double capacidadRestante() {
        return volumen - contenido;
    }

    public boolean estarVacio() {
        return contenido == 0;
    }

    public boolean estaLleno() {
        return contenido == volumen;
    }

    public double rellenar(double cantidad) {
        double contenidoTemporal = contenido + cantidad;
        if (contenidoTemporal > volumen) {
            double exceso = contenidoTemporal - volumen;
            contenido = volumen;
            return exceso;
        } else {
            contenido = contenidoTemporal;
            return 0;
        }
    }

    public double vacia() {
    
        double contenidoAnterior = this.contenido;
        this.contenido = 0.0;
        return contenidoAnterior;
    }

    public void vierte(Recipiente otroRecipiente) {
        double exceso = otroRecipiente.rellenar(this.contenido);
        this.contenido = exceso;
    }

    public boolean mismaCapacidad(Recipiente otroRecipiente) {
        return this.volumen == otroRecipiente.volumen;
    }

    public boolean mismasDimensiones(Recipiente otroRecipiente) {
        return this.altura == otroRecipiente.altura && this.radio == otroRecipiente.radio;
    }

    public boolean contieneMas(Recipiente otroRecipiente) {
        return this.contenido > otroRecipiente.contenido;
    }

    public boolean cabeMas(Recipiente otroRecipiente) {
        return this.capacidadRestante() > otroRecipiente.capacidadRestante();
    }

    public Recipiente crearContenidoJusto() {
        double altura_2 = (volumen - contenido) / (Math.PI * radio * radio);
        return new Recipiente(altura_2, radio);
    }

    public String Muestra() {
        return "El recipiente actual cuenta con las siguientes características:\n" +
               "Altura: " + altura + "\n" +
               "Radio: " + radio + "\n" +
               "Volumen: " + volumen + "\n" +
               "Contenido: " + contenido;
    }

    public static void main(String[] args) {
        Recipiente recipiente1 = new Recipiente(10, 5);       
        System.out.println(recipiente1.Muestra());
        
        
    }
}