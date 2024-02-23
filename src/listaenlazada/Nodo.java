
package listaenlazada;


public class Nodo {
    
    
    public int dato;
    public Nodo siguiente; 
    
    
    
     
    public Nodo(int d){
        dato = d;
    }
    
    
    
    public Nodo(int d ,  Nodo n ){
        
        dato= d;
        siguiente=n;
    }
    
}
