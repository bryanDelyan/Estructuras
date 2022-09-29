/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Viaje;

/**
 *
 * @author Usuario
 */
public class test {
    public static void main(String[] args) {
        Viaje v= new Viaje(); 
        v.addGasto(new Gastos(20000,Tipo.COMIDA));
        v.addGasto(new Gastos(30000,Tipo.HOSPEDAJE));
        v.addGasto(new Gastos(40000,Tipo.TRANSPORTE));
        v.addGasto(new Gastos(50000,Tipo.ROPA));
       
    }
}
