import java.util.Scanner;

public class Main{
  public static void main(String[] args){

  Scanner in = new Scanner(System.in);
  String nombre = "";
  int base = 0;
  double num_uno = 0, num_dos = 0, resultado = 0;

   System.out.println("~~~~~~~~~~~~~~");
   System.out.println(" CALCULADORA ");
   System.out.println("~~~~~~~~~~~~~~");
   System.out.print("");
  
   
   System.out.println("Bienvenido a la calculadora malota: Ingrese su nombre, presione 1 para suma, 2 para multiplicacion y 3 para division; ");
 
   System.out.println("Introduce tu nombre: ");
   nombre = in.nextLine();

   System.out.println("Ingrese un numero entre el 1 y el 3");

   base = in.nextInt(); 

   if(base == 1){
   
    System.out.println("Ingresa el primer numero: ");
    num_uno = in.nextInt();

    System.out.println("Ingresa el segundo numero: ");
    num_dos = in.nextInt();

    resultado = num_uno + num_dos;

    System.out.print("");

    System.out.println(nombre + ", el resultado de la suma es: " + resultado);
  } else if(base == 2){
    
    System.out.println("Ingresa el primer numero: ");
    num_uno = in.nextInt();

    System.out.println("Ingresa el segundo numero: ");
    num_dos = in.nextInt();

    resultado = num_uno * num_dos;

    System.out.print("");

    System.out.println(nombre + ", el resultado de la multiplicacion es: " + resultado);
  } else if(base == 3){
 
    System.out.println("Ingresa el primer numero: ");
    num_uno = in.nextInt();

    System.out.println("Ingresa el segundo numero: ");
    num_dos = in.nextInt();

    resultado = num_uno / num_dos;

    System.out.print("");

    System.out.println(nombre + ", el resultado de la division es: " + resultado);
  } else{

    System.out.println("Numero invalido " + nombre+ " , elige un numero entre {1,2,3}");
  }
 } 
}
