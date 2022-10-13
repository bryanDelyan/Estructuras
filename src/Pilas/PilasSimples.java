/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilas;

/**
 *
 * @author Bryan Delgado - bryanadriands@ufps.edu.co
 */
public class PilasSimples <E> {
    private Nodo <E> cima;

    public PilasSimples() {
    }

    public PilasSimples(Nodo<E> cima) {
        this.cima = cima;
    }

    public Nodo<E> getCima() {
        return cima;
    }

    public void setCima(Nodo<E> cima) {
        this.cima = cima;
    }
    
    public boolean esVacia(){
    
        return cima == null;
    }
    public void apilar(E dato){
     Nodo aux;
     aux= new Nodo (dato,cima);
     cima = aux;
    
       
   
    }
    //Poddemos pasar parametros o no como elimina solo el que esta en la cima no hay problemas
    public E desapilar(){
    
        E  resultado;
        if(esVacia()){
            System.out.println("Pila vacía");
            
        }
        resultado = cima.getDato();
        cima = cima.getSiguiente();
       
        return resultado;
        
        
   
    }
    
    public void listar(){
        // Crea una copia de la pila.
        Nodo <E> aux = cima;
        // Recorre la pila hasta el ultimo nodo.
        while(aux != null){
            System.out.print(aux.getDato()+ "->");
            
            aux = aux.getSiguiente();
        }
        System.out.println("null");
    }
}
