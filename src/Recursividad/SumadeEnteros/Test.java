package Recursividad.SumadeEnteros;

public class Test {

    //Otro ejercicio
    void imprimir(int x){
    if(x>0){
    imprimir(x-1);
    System.out.println(x);  
}

    }
    public static void main(String[] args) {
        sumaDeEnteros suma = new sumaDeEnteros();
        System.out.println(suma.sumarEnteros(10));
        Test t = new Test();
        t.imprimir(5);
    }

}
