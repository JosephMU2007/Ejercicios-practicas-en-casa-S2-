public class MainModulo {

    public static void main(String[] args) {

        Modulo login = new Modulo();
        Modulo inventario = new Modulo();
        Modulo reportes = new Modulo();

        login.nombre = "Login";
        login.lenguaje = "Java";
        login.version = "1.0";
        login.terminado = false;

        inventario.nombre = "Inventario";
        inventario.lenguaje = "Java";
        inventario.version = "1.2";
        inventario.terminado = false;

        reportes.nombre = "Reportes";
        reportes.lenguaje = "Java";
        reportes.version = "2.0";
        reportes.terminado = false;

        login.marcarTerminado();

        login.mostrarInformacion();
        inventario.mostrarInformacion();
        reportes.mostrarInformacion();
    }
}