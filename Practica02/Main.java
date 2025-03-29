package practica2;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Simulacion con while: ");
        Manecillas relojWhile = new Manecillas(55, 9, 11, 12);
        int contador = 0;
        while (contador < 60) { 
          relojWhile.manecillaSegundo();
          relojWhile.manecillas();
          contador++;
          try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }  
        System.out.println("\nSimulacion con for: ");
        Manecillas relojFor = new Manecillas(55, 9, 10, 12);
        for (int i = 0; i < 60; i++) {
          relojFor.manecillaSegundo();
          relojFor.manecillas();
          try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
        e.printStackTrace();
      }
    } 
        System.out.println("\nSimulacion con do-while: ");
        Manecillas relojDoWhile = new Manecillas(28, 9, 10, 12);
        do {
          relojDoWhile.manecillaSegundo();
          relojDoWhile.manecillas();
          try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
        e.printStackTrace();
      }
    } while (relojDoWhile.getMinutos() < 1); 
  }
}