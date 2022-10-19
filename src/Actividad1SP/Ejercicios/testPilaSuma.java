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
public class testPilaSuma {
    public static void main(String[] args) {
        PilasSimples p = new PilasSimples();
        p.apilar(2);
        p.apilar(3);
        p.apilar(4);
        p.apilar(5);
        p.apilar(2);
        p.apilar(3);
        p.apilar(1);
        System.out.println("Pila");
        p.listar();
        System.out.println("Pila sumando los primeros 4 elementos: ");
        PilaSuma s = new PilaSuma();
        s.junta(p, 4);
      
        
        PilasSimples p2 = new PilasSimples();
        p2.apilar(2);
        p2.apilar(3);
        p2.apilar(1);
        System.out.println("Pila");
        p2.listar();
        System.out.println("Pila sumando los primeros 4 elementos: ");
     
        s.junta(p2, 4);
        
        
        
    }
}
