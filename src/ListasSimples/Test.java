/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasSimples;

/**
 *
 * @author Bryan Delgado - bryanadriands@ufps.edu.co
 */
public class Test {

    public static void main(String[] args) {
        ListaSimple<Integer> l2 = new ListaSimple();
        //Boolean bool = Boolean.TRUE;
        //Integer num = 10;
        l2.add(3);
        l2.add(7);
        l2.add(9);
        l2.add(11);
        // l2.imprimir();
        System.out.println("Lista por inicio : " + l2.toString());

        ListaSimple<Integer> l1 = new ListaSimple();
        l1.agregarFinal(3);
        l1.agregarFinal(7);
        l1.agregarFinal(9);
        l1.agregarFinal(11);
        //l1.imprimir();
        System.out.println("Lista por el final : " + l1.toString());
        
       System.out.println("Lista por inicio : " + l2.toString());
        
        l2.eliminarInicio(Integer.SIZE);
        System.out.println("Eliminado el primer dato de la lista que se agrega por el inicio: "+ l2.toString());

        l2.eliminarInicio(Integer.SIZE);
        System.out.println("Eliminando el ultimo dato de la lista que se agrega por el inicio: " + l2.toString());
       
        l2.buscar(7);
        System.out.println("" +l2.toString());
       
        
        l2.elimarLista(Integer.SIZE);
        System.out.println("Lista ingresada por el inicio ahora : " + l2.toString());
        
        
        

        /**
         * String cadena = "Hello world"; String cadena1= "Hola"; String
         * cadena2= "salut monde";
         *
         *
         *
         *
         * l.add(cadena); l.add(cadena1); l.add(cadena2); l.imprimir();
         * System.out.println("");
         *
         * l.addFinal(cadena2); l.addFinal(cadena1); l.addFinal(cadena);
         * l.imprimir(); System.out.println("");
         *
         * l.eliminarInicio(l); l.imprimir(); System.out.println("");
         *
         * l.eliminarFinal(l); l.imprimir(); System.out.println("");
         *
         * System.out.println(""); l.elimarLista(l); l.imprimir();
         */
    }
}
