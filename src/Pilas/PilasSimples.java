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
    private int tamanio;

    public PilasSimples() {
        tamanio = 0;
        cima = null;
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
     tamanio++;
    
       
   
    }
    //Poddemos pasar parametros o no como elimina solo el que esta en la cima no hay problemas
    public E desapilar(){
    
        E  resultado;
        if(esVacia()){
            System.out.println("Pila vacía");
            
        }
        resultado = cima.getDato();
        cima = cima.getSiguiente();
       tamanio--;
        return resultado;
        
        
   
    }
    
    public int size(){
       
        return tamanio;
    }
    
    public boolean buscar(E dato){
         Nodo<E> aux = this.cima;
        while (aux != null) {
            if (aux.getDato().equals(dato)) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }
    public void desapilarEspecifico(E dato) {
        while (buscar(dato)) {
            if (cima.getDato() == dato) {
                cima = cima.getSiguiente();
            } else {
                Nodo<E> aux = cima;
        while (aux.getSiguiente().getDato() != dato) {
                    aux = aux.getSiguiente();
                }
                Nodo<E> siguiente = aux.getSiguiente().getSiguiente();
                aux.setSiguiente(siguiente);
            }
        }
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
