/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ColasSimples;

/**
 *
 * @author Bryan Delgado - bryanadriands@ufps.edu.co
 */
public class Nodo <E>{
    
   private Nodo <E> dato;
   private Nodo <E> siguiente;

    public Nodo() {
    }

    public Nodo(Nodo<E> dato, Nodo<E> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Nodo<E> getDato() {
        return dato;
    }

    public void setDato(Nodo<E> dato) {
        this.dato = dato;
    }

    public Nodo<E> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<E> siguiente) {
        this.siguiente = siguiente;
    }
   
   
   
   
}
