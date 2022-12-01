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
public class PilaReorganizable {
    //int elemento = 0;
    //PilasSimples aux = new PilasSimples();

    public PilaReorganizable() {
   //     elemento = 0;
    }
    
    
    public void pilaReorganizable(PilasSimples p, int m){
    
        if(!p.buscar(m)){
            p.apilar(m);
        
        }else{
        p.desapilarEspecifico(m);
        p.apilar(m);
        }
    
    p.listar();
    }
    
    /*
        public void reorganizable(Pila<Integer> pila, int n) {

        while (!pila.esVacia()) {
            aux = pila.dePilar();
            if (n != aux) {
                pilaAux.apilar(aux);
            }
        }
        while (!pilaAux.esVacia()) {
            pila.apilar(pilaAux.dePilar());
        }

        pila.apilar(n);
        pila.listar();
    }
    }*/
    
    
}
