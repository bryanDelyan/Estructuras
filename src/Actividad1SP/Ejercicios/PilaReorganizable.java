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
    PilasSimples p = new PilasSimples();

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
    
    /*public void eliminarDato(PilasSimples<Integer> p,int dato){
       // Nodo aux = new Nodo();
      int elemento; 
        if(!p.esVacia()){
            elemento = (int) p.desapilar();
            if(elemento != dato){
                
                eliminarDato(p,dato);
                p.apilar(elemento);
               
               
                
            }
            
            
        }
        
    } */
   //Funciona el método pero no elima el número al cual pasamos a la cima, cuando este se repite
   
    
    /*public void pilaReorganizable(PilasSimples p1, int dato){
        
        eliminarDato(p1,dato);
        p1.apilar(dato);
        p1.listar();
        
    }*/
    
    
}
