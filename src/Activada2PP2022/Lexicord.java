/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activada2PP2022;
import ListasSimples.Nodo;
import ListasSimples.ListaSimple;
/**
 *
 * @author Bryan Delgado - bryanadriands@ufps.edu.co
 */
public class Lexicord {
     ListaSimple <Integer> lista1;

    public Lexicord() {
        lista1 = new ListaSimple();
    }

    public void agregar(int num) {
        lista1.agregarFinal(num);
    }

    public void imprimir() {
        lista1.imprimir();
    }

    public boolean Lexicord(ListaSimple lista2) {

        if ((this.lista1 == null) || (lista2 == null)) {
            throw new RuntimeException("Lista vacia");

        }

        Nodo<Integer> auxl1 = lista1.getInicio();
        Nodo<Integer> auxl2 = lista2.getInicio();

        while (auxl1 != null || auxl2 != null) {

            if (auxl1.getDato() > auxl2.getDato()) {
                return true;
            }

            if (auxl1.getDato() < auxl2.getDato()) {
                return false;
            }

            if (this.lista1.equals(lista2)) {
                return false;
            }

            if (auxl1.getDato() == auxl2.getDato() && auxl1.getSiguiente() == null && auxl2.getSiguiente() == null) {
                return false;
            }

            if (auxl1.getDato() == auxl2.getDato() && auxl2.getSiguiente() == null) {
                return true;
            }

            auxl1 = auxl1.getSiguiente();
            auxl2 = auxl2.getSiguiente();

        }

        return false;

    }
}
