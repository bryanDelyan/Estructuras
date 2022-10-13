/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilas;

/**
 *
 * @author Bryan Delgado - bryanadriands@ufps.edu.co
 */
public class Nodo<E> {
  private E dato;
  private Nodo siguiente;

    public Nodo() {
    }

    public Nodo(E dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
  
    
}
