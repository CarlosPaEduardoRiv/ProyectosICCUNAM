public class Nodo {
  int primerElemento;
  Nodo siguienteNodo;

  public Nodo(int primerElemento) {
    this.primerElemento = primerElemento;
    this.siguienteNodo = null;
  }
}

class ListasLigadas {
  int numeroElementos;
  Nodo nodoCabeza;

  public ListasLigadas() {
    this.nodoCabeza = null;
    this.numeroElementos = 0;
  }

  public void agregarElemento(int elemento) {
    Nodo nuevoNodo = new Nodo(elemento);
      
    if (nodoCabeza == null) {
        nodoCabeza = nuevoNodo;
    } else {
        Nodo nodoActual = nodoCabeza;
    while (nodoActual.siguienteNodo != null) {
        nodoActual = nodoActual.siguienteNodo;
        }
      nodoActual.siguienteNodo = nuevoNodo;
    }
    numeroElementos++;
  }

  public void eliminarNodo(int numero) {
      if (nodoCabeza == null) {
        return;
      }

      if (nodoCabeza.primerElemento == numero) {
        nodoCabeza = nodoCabeza.siguienteNodo;
        numeroElementos--;
        return;
      }
      Nodo nodoActual = nodoCabeza;
      Nodo nodoAnterior = null;
          
      while (nodoActual != null && nodoActual.primerElemento != numero) {
        nodoAnterior = nodoActual;
        nodoActual = nodoActual.siguienteNodo;
      }
      
      if (nodoActual != null) {
        nodoAnterior.siguienteNodo = nodoActual.siguienteNodo;
        numeroElementos--;
      }
  } 

  public String toString() {
    StringBuilder cadena = new StringBuilder("[");
    Nodo nodoActual = nodoCabeza;
      
    while (nodoActual != null) {
        cadena.append(nodoActual.primerElemento);
    if (nodoActual.siguienteNodo != null) {
        cadena.append(", ");
      }
       nodoActual = nodoActual.siguienteNodo;
     }
    cadena.append("]");
    cadena.append("\nEl total de elementos actuales es de: ").append(numeroElementos);
    return cadena.toString();
  }
}
