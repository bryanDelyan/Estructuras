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
        Boolean bool = Boolean.TRUE;
        Integer num = 10;
        String cadena = "Hello world";
        
        l.add(cadena);
        l.add(bool);
        l.add(num);
        l.imprimir();
        System.out.println("");
        
        l.addFinal(bool);
        l.addFinal(num);
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
