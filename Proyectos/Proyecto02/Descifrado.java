import java.util.Scanner;

public class Descifrado {
    
    public String descifradoNulo(String original, int n) {
        String palabraActual = "";
        String palabraFormada = "";
        
        for(int i = 0; i < original.length(); i++) {
            char letra = original.charAt(i);
            
            if(letra != ' ') {
                palabraActual += letra;
            } else {
                if(palabraActual.length() > n) {
                    palabraFormada += palabraActual.charAt(n);
                }     
                palabraActual = "";   
            }
        }
        if(!palabraActual.isEmpty() && palabraActual.length() > n) {
            palabraFormada += palabraActual.charAt(n);
            System.out.println("\nMensaje descifrado: " + palabraFormada);
        }
        return palabraFormada;
    }

    public String descifraNulo(String original) {
        int espaciosFinal = 0;
        for(int i = original.length()-1; i >= 0 && original.charAt(i) == ' '; i--) {
            espaciosFinal++;
        }
            
        String palabraActual = "";
        String palabraFormada = "";
            
        for(int i = 0; i < original.length(); i++) {
            char letra = original.charAt(i);
                
            if(letra != ' ') {
                palabraActual += letra;
            } else {
                if(!palabraActual.isEmpty()) {
                    if(palabraActual.length() > espaciosFinal) {
                        palabraFormada += palabraActual.charAt(espaciosFinal);
                    }
                    palabraActual = "";
                }
            }
        }
        if(!palabraActual.isEmpty() && palabraActual.length() > espaciosFinal) {
            palabraFormada += palabraActual.charAt(espaciosFinal);
        }    
        System.out.println("\nMensaje descifrado por cantidad de espacios: " + palabraFormada);
        return palabraFormada;
    }

    public boolean contieneNombre(String mensaje, String nombre) {
        String mensajePuro = mensaje.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String nombrePuro = nombre.replaceAll("[^a-zA-Z]", "").toLowerCase();

        boolean contieneElNombre = mensajePuro.contains(nombrePuro);
        System.out.println("Es " + contieneElNombre + " contiene nombre.");
        return contieneElNombre;
    }

    public String descifraPalabrasMarcadas(String m, String e) {
        String descifrado = "";
        int i = 0, l = 0;
        
        while (i < m.length() && l < e.length()) {
            String palabraM = "";
            while (i < m.length() && m.charAt(i) != ' ') {
                palabraM += m.charAt(i);
                i++;
            }
            
            String palabraE = "";
            while (l < e.length() && e.charAt(l) != ' ') {
                palabraE += e.charAt(l);
                l++;
            }

            if (!palabraM.equalsIgnoreCase(palabraE)) {
                if (!descifrado.isEmpty()) {
                    descifrado += " ";
                }
                descifrado += palabraM;
            }
            
            while (i < m.length() && m.charAt(i) == ' ') i++;
            while (l < e.length() && e.charAt(l) == ' ') l++;
        }
        
        System.out.println("El texto oculto es: " + descifrado);
        return descifrado;
    }

    public String descifraLetrasMarcadas(String m, String e) {
        String mensajeOculto = "";
        int i = 0, j = 0;
        
        while (i < m.length() && j < e.length()) {
            while (i < m.length() && m.charAt(i) == ' ') i++;
            while (j < e.length() && e.charAt(j) == ' ') j++;
            
            if (i >= m.length() || j >= e.length()) break;
        
            char letraM = Character.toLowerCase(m.charAt(i));
            char letraE = Character.toLowerCase(e.charAt(j));
            
            if (letraM != letraE) {
                mensajeOculto += letraM;
            }
            
            i++;
            j++;
        }
        
        System.out.println("El mensaje oculto es: " + mensajeOculto);
        return mensajeOculto;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Primera operación
        System.out.print("\nDescifrado Nulo con una cadena y numero entero: \nPresiona enter para continuar");
        entrada.nextLine(); 
        
        System.out.print("\nIntroduce un texto a descifrar: ");
        String original = entrada.nextLine();
        
        System.out.print("\nIntroduce un numero: ");
        int n = entrada.nextInt();
        entrada.nextLine(); 
        
        Descifrado textoEjemplo_1 = new Descifrado();
        textoEjemplo_1.descifradoNulo(original, n); 

        // Segunda operación
        System.out.print("\nDescifrado Nulo con un cadena y espacios finales: ");
        System.out.print("\nIntroduce un texto con mensaje oculto: ");
        String original_2 = entrada.nextLine();
        
        Descifrado textoEjemplo_2 = new Descifrado();
        textoEjemplo_2.descifraNulo(original_2);

        // Tercera operación
        System.out.print("\nSaber si un nombre esta oculto dentro de un texto: ");
        System.out.print("\nIntroduce un texto con nombre oculto: ");
        String mensaje = entrada.nextLine();
        
        System.out.print("\nIntroduce un nombre: ");
        String nombre = entrada.nextLine();
        
        Descifrado textoEjemplo_3 = new Descifrado();
        textoEjemplo_3.contieneNombre(mensaje, nombre);

        // Cuarta operación
        System.out.print("\nEncontrar un mensaje oculto por medio de palabras: ");
        System.out.print("\nIntroduce un texto: ");
        String m_1 = entrada.nextLine();
        
        System.out.print("\nIntroduce un texto: ");
        String e_1 = entrada.nextLine();
        
        Descifrado textoEjemplo_4 = new Descifrado();
        textoEjemplo_4.descifraPalabrasMarcadas(m_1, e_1);

        // Quinta operación
        System.out.print("\nEncontrar un mensaje oculto por medio de letras: ");
        System.out.print("\nIntroduce un texto: ");
        String m_2 = entrada.nextLine();
        
        System.out.print("\nIntroduce un texto: ");
        String e_2 = entrada.nextLine();
        
        Descifrado textoEjemplo_5 = new Descifrado();
        textoEjemplo_5.descifraLetrasMarcadas(m_2, e_2);
        
        entrada.close();
    }
}