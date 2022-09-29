/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasCircularesSimple;

/**
 *
 * @author Usuario
 */
public class test {
    public static void main(String[] args) {
         ListaCircular<Integer> l2 = new ListaCircular();
        
        l2.addInicio(3);
        l2.addInicio(7);
        l2.addInicio(9);
        l2.addInicio(11);
        
        l2.listar();
    }
}
