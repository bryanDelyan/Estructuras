/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad1SP.Ejercicios;

import Pilas.PilasSimples;

/**
 *
 * @author Usuario
 */
public class testPilaMenor {
    public static void main(String[] args) {
        PilasSimples <Integer> p = new PilasSimples();
        p.apilar(2);
        p.apilar(5);
        p.apilar(4);
        p.apilar(2);
        p.apilar(3);
        p.apilar(2);
        System.out.println("Pila");
        p.listar();
        PilaMenor r = new PilaMenor();
        System.out.println("Pila organizada");
       r.pilarMenor(p);
        
       
        
    }
}
