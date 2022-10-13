/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimerPrevio;

import ListasSimples.ListaSimple;

/**
 *
 * @author Usuario
 */
public class test {
    
    public static void main(String[] args) {
        
        Lista l1 = new Lista();
    
        l1.agrNum(0);
        l1.agrNum(2);
        l1.agrNum(3);
        l1.imprimir();
        
        ListaSimple l2 = new ListaSimple();
        
        l2.add(0);
        l2.add(2);
        l2.add(3);
        
        
       boolean es = l1.comparar(l2);
       if(es) System.out.println("Son iguales");
       else System.out.println("Diferentes");
        
       Lista aux = new Lista();
       aux.buscarListas(l2, l2);
       aux.imprimir();
       
        
    }
    
}
