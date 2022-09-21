/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasSimples;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ufps
 * @param <M>
 */
public class ListaSimple<M> {

    private Nodo<M> inicio;
    private Nodo<M> ultimo;
    private int size;
    
    public ListaSimple() {

    }

    public ListaSimple(Nodo<M> inicio, Nodo<M> ultimo) {
        this.inicio = inicio;
        this.ultimo = ultimo;
    }
     public int getSize() {
        return size;
    }

    public Nodo<M> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo<M> ultimo) {
        this.ultimo = ultimo;
    }

    public Nodo<M> getInicio() {
        return inicio;
    }

    public void setInicio(Nodo<M> inicio) {
        this.inicio = inicio;
    }

    //Agregamos por el inicio un dato si la lista esta vacia
    public void add(M dato) {
        Nodo<M> nuevo = new Nodo<>();
        nuevo.setDato(dato);

        if (inicio == null) {
            inicio = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;

        }
    }

    //Agregamos al final este no me funciono xd
    public void addFinal(M dato) {
        Nodo<M> nuevo = new Nodo<>();
        nuevo.setDato(dato);

        if (ultimo == null) {
            inicio = nuevo;
            ultimo = nuevo;
        } //Apuntamos el último al nuevo y ahora el último toma el valor de nuevo.
        else {

            nuevo.setSiguiente(ultimo);
            ultimo = nuevo;
        }
    }

    public void agregarFinal(M dato) {
        if (this.inicio == null) {
           this.add(dato);
        }
        else{ 
                ultimo = getPos(this.size);
                Nodo<M> nuevo = new Nodo(dato, null);
                
                ultimo.setSiguiente(nuevo);
                this.size++;
    }           
        
    
    } 
    //Este método nos ayuda a obtener la posición en la que se encuntra un elemento en la lista
     private Nodo<M> getPos(int i)  {
        if (inicio == null || i < 0 || i >= this.getSize()) {
           
        }

        Nodo<M> aux = this.inicio;
        while (i > 0) {
            aux = aux.getSiguiente();
            i--;
        }
        return aux;
    }

    public void elimarLista(M dato) {
        inicio = null;
    }

    //Revisar
    public M eliminarInicio(M dato) {

        if (inicio == null) {
            System.out.println("Lista vacia");

        }
        M elementoEliminado = this.inicio.getDato();
        if (this.inicio == this.ultimo) {
            this.inicio = this.ultimo = null;
        } else {
            this.inicio = inicio.getSiguiente();
            

        }
        return elementoEliminado;
    }

    public M eliminarFinal(M dato) {

        if (inicio == null) {
            System.out.println("Lista vacia");
        }
        M elementoEliminado = this.ultimo.getDato();
        if (this.inicio == this.ultimo) {
            this.inicio = this.ultimo = null;
        } else {
            Nodo actual = this.ultimo;
            while (actual.getSiguiente() != this.ultimo) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(null);
            this.ultimo = actual;
           
        }
        return elementoEliminado;
    }

    public void buscar(M dato) {
        Nodo actual = new Nodo();
        actual = inicio;
        while(actual != null){
            if(actual.getDato() == dato){
                System.out.println("Si esta en la lista el dato : " + dato);
            }
            actual = actual.getSiguiente();
        }
        
        
    }
    
    

    public void eliminarCualquierPosicion(M dato) {
       
    }

    @Override
    public String toString() {
        if (this.inicio == null) {
            return "Lista Vacia";
        }
        String msg = "Lista {";
        for (Nodo<M> s = this.inicio; s != null; s = s.getSiguiente()) {
            msg += s.getDato().toString() + ",";
        }
        return msg + "}";
    }

    /*
    public void imprimir() {
        if (inicio == null) {
            System.out.println("Vacia");
        } else {
            Nodo n = this.inicio;
            while (n != null) {
                System.out.println(n.getDato().toString());
                n = n.getSiguiente();
            }
        }*/
}
