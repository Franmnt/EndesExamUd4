public class Matricula extends MatriculaPadre {

    Alumno alumno;
    Asignatura asignatura;
    Profesor profesor;
    public double nota;

    public Matricula(Alumno alumno, Asignatura asignatura, Profesor profesor, double nota) {
        this.alumno = alumno;
        this.asignatura = asignatura;
        this.profesor = profesor;
        this.nota = nota;
    }

}
