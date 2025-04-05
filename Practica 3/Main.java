public class Main {
  public static void main(String[] args) {
    ListasLigadas listaDeclarada = new ListasLigadas();
  
    System.out.println("\nLista vacía: " + listaDeclarada);
            
    listaDeclarada.agregarElemento(10);
    listaDeclarada.agregarElemento(20);
    listaDeclarada.agregarElemento(30);
    listaDeclarada.agregarElemento(40);
    listaDeclarada.agregarElemento(50);
    System.out.println("Lista con 5 elementos del tipo int: " + listaDeclarada);
  
    listaDeclarada.eliminarNodo(10);
    System.out.println("Lista sin cabeza: " + listaDeclarada);
  
    listaDeclarada.eliminarNodo(30);
    System.out.println("Lista sin un elemento: " + listaDeclarada);
 }
}
