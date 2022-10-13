/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimerPrevio;
import ListasSimples.ListaSimple;
import ListasSimples.Nodo;
import java.util.Objects;

/**
 *
 * @author Usuario
 */

public class Lista {
    ListaSimple <Integer> l1;

    public Lista() {
        l1 = new ListaSimple();
    }

    public Lista(ListaSimple<Integer> l1) {
        this.l1 = l1;
    }
    

    
    public void agrNum(int num) {
        l1.add(num);
    }
     public void imprimir() {
        l1.toString();
    }
     public void buscarListas(ListaSimple<Integer> l1, ListaSimple<Integer> l2){
        Nodo aux1 =l1.getInicio();
        Nodo aux2 =l2.getInicio();
        ListaSimple<Integer> x = null;
        while(aux1 !=null || aux2 != null){ 
            if(aux1.getDato() == aux2.getDato()){
                
                aux1.setDato(0);
                aux1.getSiguiente();
                aux2.getSiguiente();
                break;
               
            }
             
        }    
              

}
   
     
     
     public boolean comparar (ListaSimple <Integer> l2){
           if ((l1 == null) || (l2 == null)) {
            throw new RuntimeException("Lista vacia");

        }
        Nodo<Integer> auxl1 = l1.getInicio();
        Nodo<Integer> auxl2 = l2.getInicio();
        
         while (auxl1 != null || auxl2 != null) {
             
             if(Objects.equals(auxl1.getDato(), auxl2.getDato()))
                return true;
             
            auxl1 = auxl1.getSiguiente();
            auxl2 = auxl2.getSiguiente();
         }
         return false;
         
     
     }

   
    
}


