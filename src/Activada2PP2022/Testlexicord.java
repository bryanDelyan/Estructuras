/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activada2PP2022;

import ListasSimples.ListaSimple;

/**
 *
 * @author Bryan Delgado - bryanadriands@ufps.edu.co
 */
public class Testlexicord {
    public static void main(String[] args) {
        Lexicord l1 = new Lexicord();
       l1.agregar(3);
       l1.agregar(5);
       l1.agregar(8);
       l1.agregar(5);
       l1.agregar(10);
       l1.agregar(2);
       l1.agregar(1);
       
       
        ListaSimple<Integer> l2 = new ListaSimple();
        
       l2.agregarFinal(3);
       l2.agregarFinal(5);
       l2.agregarFinal(8);
       l2.agregarFinal(5);
       l2.agregarFinal(10);
       l2.agregarFinal(2);
       l2.agregarFinal(1);
       
       
        System.out.println("Son iguales las listas ?");
        System.out.println();
        if (l1.Lexicord(l2) == true) {
            System.out.println("Falso");
            
        }
        else{
            System.out.println("Verdadero");
        }
        
    }
       
    }

