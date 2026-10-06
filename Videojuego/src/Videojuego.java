public class Videojuego {

    public String nombre;
    public String genero;

    String version;
    boolean activo;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Versión: " + version);
        System.out.println("Activo: " + activo);
        System.out.println("-------------------");
    }

    public void iniciar() {
        activo = true;
    }

    void cerrar() {
        activo = false;
    }

    void mostrarVersion() {
        System.out.println("Versión: " + version);
    }
}