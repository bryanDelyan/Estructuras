
package NavegadorWebEjercicio1Pilas;

/**
 *
 * @author Bryan Delgado - bryanadriands@ufps.edu.co
 */
public class Pagina {
    private String nombre;
    private String url;

    public Pagina() {
    }

    public Pagina(String nombre, String url) {
        this.nombre = nombre;
        this.url = url;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Pagina{" + "nombre=" + nombre + ", url=" + url + '}';
    }
    
}
