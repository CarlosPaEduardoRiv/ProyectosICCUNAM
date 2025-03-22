public class Main{

  private int segundos;
  private int minutos;
  private int horas;
  

  public Main(int segundos, int minutos, int horas){

  this.minutos = minutos;
  this.horas = horas;
  this.segundos = segundos;

  }
  public void manecillaSegundo(){
    segundos++;
    if(segundos == 60){
      segundos = 0;
      manecillaMinuto();
    }
  }
  public void manecillaMinuto(){
    
    for(int i = 0; i < 61 ; i++ ){
     minutos++;
     manecillaHora();
     if(minutos == 60){
      minutos = 0;
     } 
    }
  }
  
  public void manecillaHora(){
    
    do{
      horas++;
      if(horas == 24){
        horas = 0;
      }
    }while(minutos == 60);
  }
  
  public void Manecillas(){

    System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);
  } 

  public void mostrarHora(){
    while(true){
      Manecillas();
      manecillaSegundo();
      manecillaHora();
      
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e){
        e.printStackTrace();
      }
    }
  }
  public static void main(String[] args) {
    Main reloj = new Main(50, 49, 13);
    reloj.mostrarHora();
    
  }

}

