public class MainVideojuego {

    public static void main(String[] args) {

        Videojuego juego1 = new Videojuego();
        Videojuego juego2 = new Videojuego();
        Videojuego juego3 = new Videojuego();

        juego1.nombre = "Minecraft";
        juego1.genero = "Aventura";
        juego1.version = "1.21";
        juego1.activo = false;

        juego2.nombre = "FIFA";
        juego2.genero = "Deportes";
        juego2.version = "26";
        juego2.activo = false;

        juego3.nombre = "Valorant";
        juego3.genero = "Shooter";
        juego3.version = "10.0";
        juego3.activo = false;

        juego1.iniciar();

        juego1.mostrarInformacion();
        juego2.mostrarInformacion();
        juego3.mostrarInformacion();
    }
}