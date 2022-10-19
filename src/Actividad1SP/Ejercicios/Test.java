package Actividad1SP.Ejercicios;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import Actividad1SP.Ejercicios.Cola1;
import ColasSimples.Cola;

/**
 *
 * @author Usuario
 */
public class Test {
    
    public static void main(String[] args) {
        Cola <Integer> c = new Cola();
        Cola1  c1 = new Cola1();
        
        c.encolar(1);
        c.encolar(3);
        c.encolar(5);
        c.encolar(3);
        c.encolar(6);
        c.encolar(7);
        
        System.out.println("Cola");
        System.out.println(c.toString());
        System.out.println(c1.elima_valor(c, 3));
        
        
    }
}
