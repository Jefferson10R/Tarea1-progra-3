
package listaenlazada;

import java.util.Scanner;


public class ListaEnlazada {

  
    public static void main(String[] args) {
        
        Lista lista = new Lista();
        int opcion = 0 , numero;
        
        Scanner entrada = new Scanner(System.in);
        
        do {  
            
            
                
                System.out.println("\n1.Agregar Elemento al inicio.\n");
                System.out.println("\n2. Mostar datos de la lista.\n");
                System.out.println("\n3. Salir");
                opcion = entrada.nextInt();
                
                
                switch (opcion) {
                    case 1:
                        System.out.println("Digite el numero a , Agregar:");
                        numero = entrada.nextInt();
                        
                        lista.agregar(numero);
                        break;
                        
                    case 2: 
                        System.out.println("La lista es: \n");
                        lista.MostrarLista();
                        break;
                     
                    case 3: 
                        
                        System.out.println("Saliste del programa");
                        break;
                    default:
                        
                        System.out.println("Opciion no valida");
                        break;
                }
                
                
                
                
                
            
            
        } while (opcion != 3);
    }
    
}
