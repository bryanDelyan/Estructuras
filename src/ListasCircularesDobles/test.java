/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasCircularesDobles;

/**
 *
 * @author Bryan Delgado - bryanadriands@ufps.edu.co
 */
public class test {
    public static void main(String[] args) {
        ListaCircularDoble<Integer> l2 = new ListaCircularDoble();
        
        l2.addInicio(3);
        l2.addInicio(7);
        l2.addInicio(9);
        l2.addInicio(11);
        
        l2.imprimir();
    }
}
