package practica2;

public class Manecillas implements FuncionesDelReloj {

    private int segundos;
    private int minutos;
    private int horas;
    private int horaLimite;
  
    public Manecillas(int segundos, int minutos,int horas, int horaLimite){
  
    this.minutos = minutos;
    this.horas = horas;
    this.segundos = segundos;
    this.horaLimite = horaLimite;
    }
    public void manecillaSegundo(){
      segundos++;
      if(segundos == 60){
      segundos = 0;
      manecillaMinuto();
    }
   }
    public void manecillaMinuto(){
      minutos++;
      if(minutos == 60){
      minutos = 0;
      manecillaHora();
    }
   }
    public void manecillaHora(){  
      horas++;
      if(horas == horaLimite){
      horas = 0;
    }
   }
    public void manecillas(){
    System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);
  } 
  
}  