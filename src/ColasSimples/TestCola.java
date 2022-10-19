/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColasSimples;

/**
 *
 * @author estudiante
 */
public class TestCola {

    public static void main(String[] args) {

        Cola<String> l1 = new Cola<>();

        l1.encolar("Jose");
        l1.encolar("Maria");
        l1.encolar("Juan");
        l1.encolar("Raul");
        l1.encolar("Matias");
        l1.encolar("Rodolfo");
        l1.encolar("Alfredo");

        System.out.println("Lista Original");
        System.out.println(l1.toString());

        System.out.println("_________________");
        System.out.println("Valor desencolado");
        System.out.println(l1.desencolar());

    }

}
