/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Viaje;

import ListasSimples.ListaSimple;

/**
 *
 * @author Usuario
 */
public class Viaje {
     ListaSimple<Gastos> gastos;

    public Viaje() {
        gastos = new ListaSimple<>();
    }

    public ListaSimple<Gastos> getGasto() {
        return gastos;
    }

    public void setGasto(ListaSimple<Gastos> gasto) {
        this.gastos = gasto;
    }
    
    public void addGasto(Gastos gasto){
    gastos.add(gasto);
    
        
    }
    
      
    
    public int gastoTipo(Tipo tipo){
     
       // while(){
        
    //    }
    
        return 0;
    }
    
    public String mayorGasto(){
    
        return null;
    }
}
