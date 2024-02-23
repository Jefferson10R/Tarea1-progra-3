
package listaenlazada;


public class Lista {
    
    
    protected   Nodo inicio , fin; 
    
    
    public Lista(){
        inicio = null;
        fin = null;
    }
    
    
   
    
    
    public void agregar(int elemento){
        
       
        
        inicio = new Nodo(elemento , inicio);
        
        if(fin == null){
            fin = inicio;
        }
        
    }
    
    
    //Metodo para mostrar los datos
    
    
    public void MostrarLista(){
        
        Nodo recorrer = inicio;
        
        
       while(recorrer!=null){
           System.out.print("["+recorrer.dato+"]---->");
           recorrer = recorrer.siguiente;
       }
    }
    
}
