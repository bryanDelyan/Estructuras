/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColasSimples;

/**
 *
 * @author estudiante
 */
public class NodoCola<E> {

    private E dato;
    private NodoCola<E> siguiente;

    public NodoCola() {
    }

    public NodoCola(E dato, NodoCola<E> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public NodoCola<E> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola<E> siguiente) {
        this.siguiente = siguiente;
    }
    
    
    

}
