import java.util.List;

public class Estudiante extends PersonalAcademico{
    private List<Curso> cursoEnEsperaDeInscripcion;
    private List<Curso> cursosInscritos;
    
    public Estudiante(List<Curso> cursoEnEsperaDeInscripcion, List<Curso> cursosInscritos) {
        this.cursoEnEsperaDeInscripcion = cursoEnEsperaDeInscripcion;
        this.cursosInscritos = cursosInscritos;
    }

    public void solicitarInscripcionCurso(Curso curso){}

    public void realizarActividadSumativa(Curso curso,ActividadSumativa actividadSUmativa){}

}
