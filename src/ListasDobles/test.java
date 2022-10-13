/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasDobles;

/**
 *
 * @author Bryan Delgado - bryanadriands@ufps.edu.co
 */
public class test {
   public static void main(String[] args) {
        ListaDoble<Integer> l2 = new ListaDoble();
        
        l2.addInicio(3);
        l2.addInicio(7);
        l2.addInicio(9);
        l2.addInicio(11);
        System.out.println("Lista por el ininico: "+l2.toString());
        
       

        ListaDoble<Integer> l1 = new ListaDoble();
        l1.addFinal(3);
        l1.addFinal(7);
        l1.addFinal(9);
        l1.addFinal(11);
        //l1.imprimir();
        System.out.println("Lista por el final: "+l1.toString());
        l2.eliminarAlInicio();
        System.out.println("Lista por el inicio pero eliminado el primer dato:"+l2.toString());
       l1.eliminarAlFinal();
       System.out.println("Lista por el final pero elimandroel ultimo dato: "+l1.toString());
        
      
    }
}
