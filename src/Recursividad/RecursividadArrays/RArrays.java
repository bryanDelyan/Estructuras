package Recursividad.RecursividadArrays;



public class RArrays {
    static int [] vec = {312,614,88,22,54};
    void ordenar(int [] vec, int n){
        
            for(int i = 0; i < n - 1; i++){
                if(vec[i] > vec[i + 1]){
                    int aux = vec[i];
                    vec[i] = vec[i + 1];
                    vec[i + 1] = aux;
                }
            }
            ordenar(vec, n - 1);
        }
        public static void main(String[] args) {
            RArrays rArrays = new RArrays();
            rArrays.ordenar(vec, vec.length);
            for(int i = 0; i < vec.length; i++){
                System.out.println(vec[i]);
            }
        }
    
    }
       
    

