package EjercicioMascota;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author estudiante
 */
public class Asociacion {

    Map<Integer, Mascotas> mascotas = new HashMap<>();

    public Asociacion() {
        mascotas = new HashMap<>();
    }

    public List <Mascotas> buscarIdPropietario(int id) {
        List<Mascotas> mascotaPropietario =new ArrayList<>();
        
        Iterator it = mascotas.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            Mascotas mascota = mascotas.get(key);
           if(mascota.getResponsable() == id){
              mascotaPropietario.add(mascota);
           }
           
        }
        return mascotaPropietario;
    }

    public Mascotas buscarIDMascota(int id) {

        return mascotas.get(id);
    }

    public void add(Mascotas mascota) {
        mascotas.put(mascota.getId(), mascota);

    }
}
