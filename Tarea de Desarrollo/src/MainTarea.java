public class MainTarea {

    public static void main(String[] args) {

        Tarea tarea1 = new Tarea();
        Tarea tarea2 = new Tarea();
        Tarea tarea3 = new Tarea();

        tarea1.titulo = "Crear pantalla de login";
        tarea1.responsable = "José";
        tarea1.horasEstimadas = 4;
        tarea1.completada = false;

        tarea2.titulo = "Diseñar base de datos";
        tarea2.responsable = "Ana";
        tarea2.horasEstimadas = 6;
        tarea2.completada = false;

        tarea3.titulo = "Crear reportes";
        tarea3.responsable = "Carlos";
        tarea3.horasEstimadas = 3;
        tarea3.completada = false;

        tarea1.completar();

        tarea1.mostrarInformacion();
        tarea2.mostrarInformacion();
        tarea3.mostrarInformacion();
    }
}