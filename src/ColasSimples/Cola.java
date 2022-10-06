
package ColasSimples;

/**
 *
 * @author Bryan Delgado - bryanadriands@ufps.edu.co
 */
public class Cola <E>{
    private Nodo <E> inicio;
     private Nodo <E> ultimo;

    public Cola() {
    }

    public Cola(Nodo<E> inicio, Nodo<E> ultimo) {
        this.inicio = inicio;
        this.ultimo = ultimo;
    }

    public Nodo<E> getInicio() {
        return inicio;
    }

    public void setInicio(Nodo<E> inicio) {
        this.inicio = inicio;
    }

    public Nodo<E> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo<E> ultimo) {
        this.ultimo = ultimo;
    }
    public boolean esVacia(){
     return inicio == null;
    }
     
    public void encolar(E dato){
      
        
    }
     
}
