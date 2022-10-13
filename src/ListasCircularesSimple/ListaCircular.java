/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasCircularesSimple;

/**
 *
 *@author Bryan Delgado - bryanadriands@ufps.edu.co
 */
public class ListaCircular <E> {
private Nodo<E> inicio;
private Nodo<E> ultimo;

    public ListaCircular() {
    }

    public ListaCircular(Nodo<E> inicio, Nodo<E> ultimo) {
        this.inicio = inicio;
        this.ultimo = ultimo;
    }

    public Nodo<E> getInicio() {
        return inicio;
    }

    public void setInicio(Nodo<E> inicio) {
        this.inicio = inicio;
    }

    public Nodo<E> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo<E> ultimo) {
        this.ultimo = ultimo;
    }
    public boolean esVacia(){
        return inicio == null;
    }

    public void addInicio(E dato) {
        Nodo<E> nuevo = new Nodo<>();
        nuevo.setDato(dato);
        if (esVacia()) {
            inicio = nuevo;
            ultimo = nuevo;
            ultimo.setSiguiente(inicio);
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
            ultimo = nuevo;
        }
}
    public void listar(){
        // Verifica si la lista contiene elemento
        if (!esVacia()) {
            Nodo aux = inicio;
            
            do{
                System.out.print(aux.getDato()+"->");
                aux = aux.getSiguiente();
                
            }while(aux != inicio);
            
        }
        System.out.println("""
                           null
                           """);
    }

}

