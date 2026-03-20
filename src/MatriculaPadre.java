public abstract class MatriculaPadre {
    private Alumno alumno;
    private Asignatura asignatura;
    private Profesor profesor;
    String nota;

    public void mostrar() {
        System.out.println(alumno.nombre + " - " +
                asignatura.nombre + " - " +
                profesor.nombre + " - Nota: " + nota);
    }
}
