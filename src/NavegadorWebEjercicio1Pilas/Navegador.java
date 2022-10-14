/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NavegadorWebEjercicio1Pilas;

import Pilas.PilasSimples;
import Pilas.Nodo;

/**
 *
 *
 */
public class Navegador {

    PilasSimples<Pagina> pagina;
    PilasSimples<Pagina> aux;

    public Navegador() {
        pagina = new PilasSimples();
        aux = new PilasSimples();

    }

    public void imprimir() {
         Nodo  aux = pagina.getCima();
        while (aux != null) {
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
            
           
        }
        
    }

    public void agregar(Pagina paginas) {

        pagina.apilar(paginas);

    }

    public void adelante() {
        if (aux == null) {
            System.out.println("Vacio");
        } else {
            pagina.apilar(aux.desapilar());

        }
    }

    public void atras() {

        if (pagina != null) {
          aux.apilar(pagina.desapilar());
        } else {
          //  pagina.apilar(pagina.desapilar());
              
                System.out.println("No se puede volver hacía atras porque es null");

        }
    }

}
