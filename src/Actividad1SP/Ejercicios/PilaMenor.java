
package Actividad1SP.Ejercicios;
import Pilas.Nodo;
import Pilas.PilasSimples;
/**
 *
 * @author Usuario
 */
public class PilaMenor {
    PilasSimples<Integer> pAux = new PilasSimples();
    int menor;
    int aux;
            

    public void pilarMenor (PilasSimples<Integer> pila) {
        menor = pila.getCima().getDato();
        while (!pila.esVacia()) {
            aux = pila.desapilar();
            if (aux < menor) {
                menor = aux;
            }
            pAux.apilar(aux);
        }
        pila.apilar(menor);
        while (!pAux.esVacia()) {
            aux = pAux.desapilar();
            if(aux!=menor)
            pila.apilar(aux);
        }
        pila.listar();
    }
   
    
}
