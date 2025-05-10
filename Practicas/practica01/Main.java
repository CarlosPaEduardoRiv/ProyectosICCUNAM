import java.util.Scanner;

public class Main{
  public static void main(String[] args){

  Scanner scanner1 = new Scanner(System.in);
  Scanner scanner2 = new Scanner(System.in);
  String nombre = "";
  String puntoextra = "";
  int num_base = 0;
  double num_uno = 0, num_dos = 0, resultado = 0;

   System.out.println("~~~~~~~~~~~~~~");
   System.out.println(" CALCULADORA ");
   System.out.println("~~~~~~~~~~~~~~");
   System.out.print("");
  
   
   System.out.println("Bienvenido a la calculadora malota: Ingrese su nombre, presione 1 para suma, 2 para multiplicacion, 3 para division y 4 para escribir texto a eleccion ");
 
   System.out.println("Introduce tu nombre: ");
   nombre = scanner1.nextLine();

   System.out.println("Ingrese un numero previamente mencionado");

   num_base = scanner1.nextInt(); 

   if(num_base == 1){
   
    System.out.println("Ingresa el primer numero: ");
    num_uno = scanner1.nextInt();

    System.out.println("Ingresa el segundo numero: ");
    num_dos = scanner1.nextInt();

    resultado = num_uno + num_dos;

    System.out.print("");

    System.out.println(nombre + ", el resultado de la suma es: " + resultado);
  } else if(num_base == 2){
    
    System.out.println("Ingresa el primer numero: ");
    num_uno = scanner1.nextInt();

    System.out.println("Ingresa el segundo numero: ");
    num_dos = scanner1.nextInt();

    resultado = num_uno * num_dos;

    System.out.print("");

    System.out.println(nombre + ", el resultado de la multiplicacion es: " + resultado);
  } else if(num_base == 3){
 
    System.out.println("Ingresa el primer numero: ");
    num_uno = scanner1.nextInt();

    System.out.println("Ingresa el segundo numero: ");
    num_dos = scanner1.nextInt();

    resultado = num_uno / num_dos;

    System.out.print("");

    System.out.println(nombre + ", el resultado de la division es: " + resultado);
  } else if (num_base == 4){

    System.out.println("Ingrese su texto a eleccion");
    puntoextra = scanner2.nextLine();
    System.out.println(nombre + ", su texto es: " + puntoextra);
    System.out.print("");
    
  } else{

    System.out.println("Numero invalido " + nombre+ " , elige un numero entre 1,2,3 o 4");
  }
 } 
}