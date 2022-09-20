/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasSimples;

/**
 *
 * @author ufps
 * @param <M>
 */
public class Nodo <M> {
    private M dato;
    private Nodo <M> siguiente;

    public Nodo() {
    }

    public Nodo(M dato, Nodo<M> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public M getDato() {
        return dato;
    }

    public void setDato(M dato) {
        this.dato = dato;
    }

    public Nodo<M> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<M> siguiente) {
        this.siguiente = siguiente;
    }
  
}
