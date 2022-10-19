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
public class testPilaReorganizable {

    public static void main(String[] args) {
        PilasSimples p = new PilasSimples();
        p.apilar(1);
        p.apilar(1);
        p.apilar(3);
        p.apilar(4);
        
        System.out.println("Pila");
        p.listar();

        PilaReorganizable pr = new PilaReorganizable();
        System.out.println("Pila nueva :");
        pr.pilaReorganizable(p, 6);
        
        System.out.println("Pila nuevamente");
        p.listar();
        System.out.println("Pila nueva");
        pr.pilaReorganizable(p, 1);
        //pr.piReorganiza(p, 1);

    }
}
