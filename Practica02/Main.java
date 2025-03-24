public class Main {

  private int minutos;
  private int horas;

  public Main(int minutos, int horas) {
      this.minutos = minutos;
      this.horas = horas;
  }

  public void manecillaMinuto() {
       minutos++;
      if (minutos == 60) {
          minutos = 0;
          manecillaHora();
      }
    
  }

  public void manecillaHora() {
      horas++;
      if (horas == 24) {
          horas = 0;
      }
  }

  public void Manecillas() {
      System.out.printf("%02d:%02d%n", horas, minutos);
  }

  public void mostrarHora() {
      while (true) {
          Manecillas();
          manecillaMinuto();

          try {
              Thread.sleep(60000); 
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
  }

  public static void main(String[] args) {
      Main reloj = new Main(25, 19);
      reloj.mostrarHora();
  }
}