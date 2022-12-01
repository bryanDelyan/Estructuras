package ABBarbolesBinarios;

/**
 *
 * @author estudiante
 */
public class ArbolBB {

    private Nodo raiz;

    public boolean esVacio() {
        return raiz == null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public void insertar(int elemento) {
        if (esVacio()) {
            raiz = new Nodo(elemento);
        } else {
            raiz.insertar(elemento);
        }
    }

    public void inOrden(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            inOrden(nodo.getaIzquierdo());
            System.out.println("Dato InOrden: " + nodo.getDato() + " ");
            inOrden(nodo.getaDerecho());
        }
    }

    public void posOrden(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            posOrden(nodo.getaIzquierdo());
            posOrden(nodo.getaDerecho());
            System.out.println("Dato PosOrden: " + nodo.getDato());
        }
    }

    public void preOrden(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            System.out.println("Dato PreOrden: " + nodo.getDato());
            preOrden(nodo.getaIzquierdo());
            preOrden(nodo.getaDerecho());
        }
    }
    //tamaño 

    public int size(Nodo nodo) {
       
        if (nodo == null) {
            return 0;
        } else {//le colocamos ese uno porque no cuenta la raiz
            return 1 + size(nodo.getaIzquierdo()) + size(nodo.getaDerecho());

        }
    }
    //   Calcular la cantidad de niveles de un arbol (altura)

    public int altura(Nodo nodo) {
        if (nodo == null) {
            return -1;
        } else {

            return 1 + Math.max(altura(nodo.getaIzquierdo()), altura(nodo.getaDerecho()));

        }

    }

    public void buscarElementoArbol(Nodo nodo, int elemento) {
        try {
            if (nodo == null || nodo.getDato() == elemento) {
                System.out.println("Si existe: " + nodo.getDato());
            } else {
                if (elemento < nodo.getDato()) {
                    buscarElementoArbol(nodo.getaIzquierdo(), elemento);
                } else {
                    buscarElementoArbol(nodo.getaDerecho(), elemento);
                }
            }
        }
        catch(Exception e){
            System.out.println("No se encuentra el elemento");
        } 
           
        

    }
    //calcular la cantidad de nodos hojas ()
    //Primera forma
   
    public int cantidadDeHojas(Nodo nodo) {
        if (nodo == null) {
            return 0;
        } else {
            if (nodo.getaIzquierdo() == null && nodo.getaDerecho() == null) {
                return 1;
            } else {
                return cantidadDeHojas(nodo.getaIzquierdo()) + cantidadDeHojas(nodo.getaDerecho());
            }
        }
    }
    //Segunda forma
    public int cantidadDeHojas2(Nodo nodo){
        int contador = 0;
        if(nodo.getaIzquierdo() == null && nodo.getaDerecho() == null){
            contador = 1 ;
        }
        else{
            if(nodo.getaIzquierdo()!=null){
                contador += cantidadDeHojas2(nodo.getaIzquierdo());
                
            }
               if(nodo.getaDerecho()!=null){
                contador += cantidadDeHojas2(nodo.getaDerecho());
            }
        
    }
    return contador;
}
//Eliminar Nodos

//Determinar si un arbol es un arbol binario completo  (true or false)
public boolean arbolCompleto(Nodo nodo){
    
        if(nodo.getaIzquierdo() == null && nodo.getaDerecho() == null){
            return true;
        }
        else{
            if(nodo.getaIzquierdo() != null && nodo.getaDerecho() != null){
                return arbolCompleto(nodo.getaIzquierdo()) && arbolCompleto(nodo.getaDerecho());
            }
            else{
                return false;
            }
        
    }
}
//Arbol binario lleno // si todas las hojas estan en el mismo nivel
public boolean arbolLleno(Nodo nodo){
    if(nodo.getaIzquierdo() == null && nodo.getaDerecho() == null){
        return true;
    }
    else{
        if(nodo.getaIzquierdo() != null && nodo.getaDerecho() != null){
            return arbolLleno(nodo.getaIzquierdo()) && arbolLleno(nodo.getaDerecho());
        }
        else{
            return false;
        }
    }

}
}
