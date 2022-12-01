/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioMascota;

/**
 *
 * @author estudiante
 */
public class Tets {

    public static void main(String[] args) {
        Asociacion as = new Asociacion();
        as.add(new Mascotas(13, "Zeus", 2, 115));
        as.add(new Mascotas(16, "Tommy", 1, 116));
        as.add(new Mascotas(19, "Pablo", 3, 115));
        as.add(new Mascotas(20, "Skipper", 1, 118));
        as.add(new Mascotas(9, "Loki", 5, 118));
        System.out.println("Objeto: "+ as.buscarIDMascota(13));
        System.out.println("Objeto: "+as.buscarIdPropietario(118));
        

    }
}
