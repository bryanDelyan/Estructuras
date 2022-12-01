package Recursividad.SumadeEnteros;

public class sumaDeEnteros {
    private int numero = 1;
    private int suma = 0;

    public int sumarEnteros(int numero){
        if(numero == 1){

            return numero;
        }
        else{
            return numero + sumarEnteros(numero - 1);

        }

    }
}
