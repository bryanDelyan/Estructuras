package ABBarbolesBinarios;

/**
 *
 * @author estudiante
 */
public class Nodo {

    private int dato;
    private Nodo aDerecho;
    private Nodo aIzquierdo;
    
    public Nodo(int dato) {
        this.dato = dato;
        this.aDerecho = null;
        this.aIzquierdo = null;
    }

    public Nodo() {
        
    }
    
    public int getDato() {
        return dato;
    }
    
    public void setDato(int dato) {
        this.dato = dato;
    }
    
    public Nodo getaDerecho() {
        return aDerecho;
    }
    
    public void setaDerecho(Nodo aDerecho) {
        this.aDerecho = aDerecho;
    }
    
    public Nodo getaIzquierdo() {
        return aIzquierdo;
    }
    
    public void setaIzquierdo(Nodo aIzquierdo) {
        this.aIzquierdo = aIzquierdo;
    }

    public void insertar(int elemento) {
        if (elemento < dato) {
            if (aIzquierdo == null) {
                
                aIzquierdo = new Nodo(elemento);
            } else {
                aIzquierdo.insertar(elemento);
                
            }
        } else {
            
            if (aDerecho == null) {
                aDerecho = new Nodo(elemento);
            } else {
                aDerecho.insertar(elemento); 
            }
            
        }
    }
    
}
