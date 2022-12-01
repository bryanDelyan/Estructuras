
package ABBarbolesBinarios;

/**
 *
 * @author estudiante
 */
public class Test {
    public static void main(String[] args) {
        ArbolBB a = new ArbolBB ();
        a.insertar(8);//Este es la raiz porque es el primero que insertamos
        a.insertar(3);
        a.insertar(6);
        a.insertar(1);
        a.insertar(10);
        a.insertar(9);
        a.insertar(14);
        //a.insertar(17);
    
        
     
       
        
        System.out.println("Tamaño: "+a.size(a.getRaiz()));
        a.inOrden(a.getRaiz());
        System.out.println("");
        a.posOrden(a.getRaiz());
        System.out.println("");
        a.preOrden(a.getRaiz());
        System.out.println("Altura: "+ a.altura(a.getRaiz()));
        
        a.buscarElementoArbol(a.getRaiz(),8);
        //System.out.println("Cantidad de hojas: "+a.cantidadDeHojas(a.getRaiz()));
        System.out.println("La cantida de hojas son: " + a.cantidadDeHojas2(a.getRaiz()));
        System.out.println("El arbol es completo ?: "+a.arbolCompleto(a.getRaiz())); 
        System.out.println("Es un arbol binario lleno?: "+a.arbolLleno(a.getRaiz()));
    
    }
}
