/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasCircularesDobles;

/**
 *
 * @author Usuario
 */
public class Nodo<E> {
    private E dato;
    private Nodo<E> siguiente;
    private Nodo<E> anterior;

    public Nodo() {
    }

    public Nodo(E dato, Nodo<E> siguiente, Nodo<E> anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    /**
     * @return the dato
     */
    public E getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(E dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public Nodo<E> getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo<E> siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public Nodo<E> getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Nodo<E> anterior) {
        this.anterior = anterior;
    }
    
}
