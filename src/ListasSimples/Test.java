/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasSimples;

/**
 *
 * @author Usuario
 */
public class Test {
    public static void main(String[] args) {
        ListaSimple l = new ListaSimple();
        //Boolean bool = Boolean.TRUE;
        //Integer num = 10;
        String cadena = "Hello world";
        String cadena1= "Hola";
        String cadena2= "salut monde";
       
        
        
        
        l.add(cadena);
        l.add(cadena1);
        l.add(cadena2);
        l.imprimir();
        System.out.println("");
        
        l.addFinal(cadena2);
        l.addFinal(cadena1);
        l.addFinal(cadena);
        l.imprimir();
        System.out.println("");
        
        l.eliminarInicio(l);
        l.imprimir();
        System.out.println("");
        
        l.eliminarFinal(l);
        l.imprimir();
        System.out.println("");
        
        System.out.println("");
        l.elimarLista(l);
        l.imprimir();
    }
}
