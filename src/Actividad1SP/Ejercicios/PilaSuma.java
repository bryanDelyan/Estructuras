/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad1SP.Ejercicios;

import Pilas.PilasSimples;

/**
 *
 * @author Usuario
 */
public class PilaSuma {

    //PilasSimples <Integer> s;
    int aux;

    public PilaSuma() {
        // s = new PilasSimples();
        aux = 0;
    }

    public void junta(PilasSimples<Integer> p, int m) {
        int suma = 0;
        if (p.size() > m) {
            for (int i = 0; i < m; i++) {
                aux = p.desapilar();
                suma += aux;
            }
        } else {
            int a = 0;
            while (a < p.size()) {
                aux = p.desapilar();
                suma += aux;
            }

        }
        p.apilar(suma);
        p.listar();
    }
}
