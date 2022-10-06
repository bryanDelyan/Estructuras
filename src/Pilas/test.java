
package Pilas;

/**
 *
 * @author 
 */
public class test {
    public static void main(String[] args) {
        PilasSimples p = new PilasSimples();
        p.apilar(4);
        p.apilar(16);
        p.apilar(12);
        p.apilar(8);
        p.apilar(65);
        
        System.out.println("< Pila >");
        p.listar();
        System.out.println("< Pila nueva >");
        p.desapilar();
        p.listar();
        p.desapilar();
        System.out.println(" < Pila nueva >");
        p.listar();
    }
    
}
