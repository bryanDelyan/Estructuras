package Recursividad.FactorialRecursividad;

public class Factorial {
   
    private int factorial = 1;
    public int FactorialRecursividad(int n){
        if(n == 1 || n == 0){
            return n;
        }
        else{
            return n * FactorialRecursividad(n - 1);
        }
    }
}
