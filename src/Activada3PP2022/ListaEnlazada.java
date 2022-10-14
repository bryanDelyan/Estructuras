/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activada3PP2022;

import ListasSimples.Nodo;
import ListasSimples.ListaSimple;




/**
 *
 * Escriba un algoritmo para dividir una lista enlazada a partir de un valor x,
 * de manera que todos los nodos menores que x aparezcan antes que todos los
 * nodos mayores o iguales a x. Si x está contenido dentro de la lista, los
 * valores de x solo deben seEncuentrar después de los elementos menores que x (ver
 * ejemplo). El elemento de partición x puede aparecer en cualquier lugar de la
 * "partición derecha"; no es necesario que aparezca en el medio de las
 * particiones izquierda y derecha. Ejemplo: Entrada: 3 ->5 -> 8 -> 5 ->10 -> 2
 * -> 1 [x= 5] Salida: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
 *
 * @author Bryan Delgado - bryanadriands@ufps.edu.co
 *
 */
public class ListaEnlazada {

    ListaSimple <Integer> lista;

    public ListaEnlazada() {
        lista = new ListaSimple();
    }

    public void agregar(int num) {
        lista.agregarFinal(num);
    }

    public void imprimir() {
        lista.imprimir();
    }

    public boolean verificar(int num) { //Verificamos que el numero a buscar si se encuentre 

       Nodo <Integer> aux = lista.getInicio();

        boolean seEncuentra = false;
        while (aux != null) {
            if (aux.getDato() == num) {
                seEncuentra = true;
                break;
            }

            aux = aux.getSiguiente();
        }

        return seEncuentra;
    }
    
    
//Se puede crear dos listas auxiliares para guardar esto porque aveces 
    public void SepararLista(int num) {
        
        Nodo<Integer> aux = lista.getInicio();
        ListaSimple<Integer> lAux = new ListaSimple();

        if (verificar(num) == true) {
            while (aux != null) {
                if (aux.getDato() <= num) {
                    lAux.agregarFinal(aux.getDato()); //Si el número a buscar es mayor al dato que se encuentre en ese momento en las lista se agrega por el final
                } else {
                    lAux.add(aux.getDato());//Si es menor se coloca por el inicio, esto para ordernarlos
                }
                aux = aux.getSiguiente();
            }
            lista = lAux;
        } else {
            System.out.println("El numero ha buscar no esta");
        }
       

    }
    

}
