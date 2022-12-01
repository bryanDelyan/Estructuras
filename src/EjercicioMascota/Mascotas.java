
package EjercicioMascota;

/**
 *
 * @author estudiante
 */
public class Mascotas {
    
   private int id;
   private String nombre;
   private int edad;
   private int responsable;

    public Mascotas() {
    }

    public Mascotas(int id, String nombre, int edad, int responsable) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.responsable = responsable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getResponsable() {
        return responsable;
    }

    public void setResponsable(int responsable) {
        this.responsable = responsable;
    }

    @Override
    public String toString() {
        return "Mascotas{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", responsable=" + responsable + '}';
    }
   
}
