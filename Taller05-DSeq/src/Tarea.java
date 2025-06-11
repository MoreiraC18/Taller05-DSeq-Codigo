import java.time.LocalDateTime;

public class Tarea extends ActividadSumativa{
    private LocalDateTime fechaDePublicacion;

    public Tarea(String titulo, LocalDateTime fechaDeEntrega, String contenido, float puntajeMaximo, float calificacion,
            String id, LocalDateTime fechaDePublicacion) {
        super(titulo, fechaDeEntrega, contenido, puntajeMaximo, calificacion, id);
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public LocalDateTime getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(LocalDateTime fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }
    
}
