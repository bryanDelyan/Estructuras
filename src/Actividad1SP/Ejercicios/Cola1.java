/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad1SP.Ejercicios;

import ColasSimples.Cola;
import ColasSimples.NodoCola;
import java.lang.Integer;

/**
 *
 * @author estudiante
 */
public class Cola1 {

    Cola <Integer> cola;
    
    int n;

    
    public Cola1() {
    //    cola = new Cola();
      //  aux = new Cola();
    }

    public Cola1(Cola cola, int n) {
        this.cola = cola;
        this.n = n;
      
    }

    public void agregar(int n) {

        cola.encolar(n);

    }

    public Cola<Integer> elima_valor(Cola<Integer> q, int a) {

        Cola aux = new Cola();
       while(!q.esVacia()){
           int n = (Integer)(q.desencolar());
           if(a != n){
               aux.encolar(n);
           }
           
       }
        
       return aux;
    }

}
