/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NavegadorWebEjercicio1Pilas;

/**
 *
 * @author estudiante
 */
public class test {

    public static void main(String[] args) {
        Navegador n = new Navegador();
        Pagina p = new Pagina();
        n.agregar(new Pagina("Facebook", "www.facebook.com"));
        n.agregar(new Pagina("Uvirtual", "www.uvirtual.com"));
        n.agregar(new Pagina("Google", "www.google.com"));
            
        System.out.println("\n****Primera Pila****\n");
        n.imprimir();
        
        n.atras();
        System.out.println("\n****Pila una posicion atras****\n");
        n.imprimir();
        
        System.out.println("\n*****Pila hacia adelante*****\n");
        n.adelante();
        n.imprimir();
    
        
    }
}
