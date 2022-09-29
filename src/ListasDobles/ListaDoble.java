/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasDobles;

/**
 *
 * @author Usuario
 */
public class ListaDoble<E> {

    private Nodo<E> inicio;
    private Nodo<E> Final;

    public ListaDoble() {
    }

    public ListaDoble(Nodo<E> inicio, Nodo<E> Final) {
        this.inicio = inicio;
        this.Final = Final;
    }

    /**
     * @return the inicio
     */
    public Nodo<E> getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(Nodo<E> inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the Final
     */
    public Nodo<E> getFinal() {
        return Final;
    }

    /**
     * @param Final the Final to set
     */
    public void setFinal(Nodo<E> Final) {
        this.Final = Final;
    }

    public boolean esVacia() {
        return (this.inicio == null);
    }

    public void addInicio(E dato) {
        Nodo<E> aux = new Nodo<>();
        aux.setDato(dato);
        if (inicio == null) { //lista vacia
            inicio = aux;
            Final = aux;
        } else {
            aux.setSiguiente(inicio);
            inicio.setAnterior(aux);
            inicio = aux;

        }
    }
        
        public void addFinal(E dato) {
        Nodo<E> aux = new Nodo<>();
        aux.setDato(dato);
        if (inicio == null) {
            inicio = aux;
            Final = aux;

        } else {
            
            Final.setSiguiente(aux);
            aux.setAnterior(Final);
            Final = aux;
        }
    
    }

    public E eliminarAlInicio() {
        if (esVacia()) { //Comprobamos si la lista esta vacia
            System.out.println("La lista esta vacia");
        }

        E elementoEliminado = this.inicio.getDato();//obtener el dato del nodo
        this.inicio = this.inicio.getSiguiente(); //encontramos cual es el siguiente nodo del nodo inicio y cambiamos la referencia

        return elementoEliminado;

    }
    //E de la forma larga y Void parala forma corta
    public void eliminarAlFinal() {

        Nodo <E> aux = this.Final.getAnterior();
        
        aux.setSiguiente(null);
        Final.setAnterior(null);
        Final = aux;
        /**
        if (esVacia()) { //Comprobamos si la lista esta vacia
            System.out.println("La lista esta vacia");
        }
        E elementoEliminado = this.Final.getDato();//obtener el dato del nodo

        Nodo aux = this.inicio; //crear una referencia al nodo aux
        while (aux.getSiguiente() != this.Final) {
            aux = aux.getSiguiente();
        }
        aux.setSiguiente(null);
        this.Final = aux;

        return elementoEliminado;*/
        
    }

    @Override
    public String toString() {
        String msg = "";
        for (Nodo<E> x = this.inicio; x != null; x = x.getSiguiente()) {
           msg += x.getDato().toString() + "->";
        }
        return (msg) + "null";
    }
    

}