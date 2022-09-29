/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasCircularesDobles;

/**
 *
 * @author Usuario
 * @param <E>
 */
public class ListaCircularDoble <E>{
    private Nodo<E> inicio;
    private Nodo<E> Final;

    public ListaCircularDoble() {
    }

    public ListaCircularDoble(Nodo<E> inicio, Nodo<E> Final) {
        this.inicio = inicio;
        this.Final = Final;
    }

    public Nodo<E> getInicio() {
        return inicio;
    }

    public void setInicio(Nodo<E> inicio) {
        this.inicio = inicio;
    }

    public Nodo<E> getFinal() {
        return Final;
    }

    public void setFinal(Nodo<E> Final) {
        this.Final = Final;
    }
//No funciona
    public void addInicio(E dato) {

         Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        if(inicio == null) {
            inicio = nuevo;
            Final = inicio;
        }else {
           
           Final.setSiguiente(nuevo);
           nuevo.setAnterior(Final);
           inicio.setAnterior(nuevo);
           nuevo.setAnterior(inicio);
           Final = nuevo;
           

        }

    }

  
    public void imprimir (){
        try {
          if(inicio != null){
          Nodo aux = inicio;
          do{
              System.out.print(aux.getDato()+"->");
              aux = aux.getSiguiente();
              
          }while(aux != inicio);
           
       }
            
            
        } catch (Exception e){
            System.out.println("""
                               null
                               """);
           
        }
      
    }
    
}
