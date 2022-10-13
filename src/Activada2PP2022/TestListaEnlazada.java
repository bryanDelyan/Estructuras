/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Activada2PP2022;

/**
 *
 * @author Usuario
 */
public class TestListaEnlazada {
    public static void main(String[] args) {
        ListaEnlazada  l1 = new ListaEnlazada();
       l1.agregar(3);
       l1.agregar(5);
       l1.agregar(8);
       l1.agregar(5);
       l1.agregar(10);
       l1.agregar(2);
       l1.agregar(1);
       
       l1.SepararLista(8);
      
       l1.imprimir();
       
    }
}
