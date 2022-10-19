package ColasSimples;

/**
 *
 * @author estudiante
 */
public class Cola<E> {

    private NodoCola<E> inicio;
    private NodoCola<E> ultimo;

    public Cola() {
        inicio = null;
        ultimo = null;
    }

    public Cola(NodoCola<E> inicio, NodoCola<E> ultimo) {
        this.inicio = inicio;
        this.ultimo = ultimo;
    }

    public NodoCola<E> getInicio() {
        return inicio;
    }

    public void setInicio(NodoCola<E> inicio) {
        this.inicio = inicio;
    }

    public NodoCola<E> getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoCola<E> ultimo) {
        this.ultimo = ultimo;
    }

    public boolean esVacia() {
        return (this.inicio == null);
    }

    public void encolar(E dato) {
        NodoCola aux;
        aux = new NodoCola(dato, null);
        if (inicio == null) {
            inicio = aux;
            ultimo = aux;
        } else {
            ultimo.setSiguiente(aux);
            ultimo = aux;
        }
    }

    public E desencolar() {
        if (esVacia()) { //Comprobamos si la lista esta vacia
            throw new RuntimeException("La lista esta vacia");
        }
        E resultado;
        resultado = inicio.getDato();
        inicio = inicio.getSiguiente();
        if (inicio == null) {
            ultimo = null;
        }
        return resultado;
    }

    public int size() {
        NodoCola<E> p = inicio;
        int n = 0;
        while (p != null) {
            p = p.getSiguiente();
            n++;
        }
        return n;
    }

    @Override
    public String toString() {

        String msj = "";
        NodoCola<E> p = inicio;
        while (p != null) {
            msj += p.getDato().toString() + "->";
            p = p.getSiguiente();
        }
        return msj;
    }
}
