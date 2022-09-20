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
public class ListaSimple<M> {

    private Nodo<M> inicio;
    private Nodo<M> ultimo;

    public ListaSimple() {

    }

    public ListaSimple(Nodo<M> inicio, Nodo<M> ultimo) {
        this.inicio = inicio;
        this.ultimo = ultimo;
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

    //Agregamos al final
    public void addFinal(M dato) {
        Nodo<M> nuevo = new Nodo<>();
        nuevo.setDato(dato);

        if (ultimo == null) {
            ultimo = nuevo;
            inicio = nuevo;
        } //Apuntamos el último al nuevo y ahora el último toma el valor de nuevo.
        else {

            nuevo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
    }

    public void elimarLista(M dato) {
        inicio = null;
    }

    //Revisar
    public void eliminarInicio(M dato) {

        if (inicio == null) {
            System.out.println("Lista vacía");

        }
        Nodo<M> elementoEliminado = inicio;
        if (inicio == ultimo) {
            inicio = ultimo = null;
        } else {
            inicio = inicio.getSiguiente();

        }

    }

    public void eliminarFinal(M dato) {

    }

    public void buscar() {
    }

    public void eliminarCualquierPosicion() {
    }

    public void imprimir() {
        if (inicio == null) {
            System.out.println("Vacia");
        } else {
            Nodo n = inicio;
            while (n != null) {
                System.out.println(n.getDato().toString());
                n = n.getSiguiente();
            }
        }
    }
}
