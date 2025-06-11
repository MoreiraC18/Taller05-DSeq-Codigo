import java.time.LocalDateTime;

public abstract class ActividadSumativa {
    protected String titulo;
    protected LocalDateTime fechaDeEntrega;
    protected String contenido;
    protected float puntajeMaximo;
    protected float calificacion;
    protected String id;
    protected Tarea tarea;
    protected Evaluacion evaluacion;

    public ActividadSumativa(String titulo, LocalDateTime fechaDeEntrega, String contenido, float puntajeMaximo,
            float calificacion, String id) {
        this.titulo = titulo;
        this.fechaDeEntrega = fechaDeEntrega;
        this.contenido = contenido;
        this.puntajeMaximo = puntajeMaximo;
        this.calificacion = calificacion;
        this.id = id;
        this.tarea=tarea;
        this.evaluacion=evaluacion;
    }

    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public LocalDateTime getFechaDeEntrega() {
        return fechaDeEntrega;
    }
    public void setFechaDeEntrega(LocalDateTime fechaDeEntrega) {
        this.fechaDeEntrega = fechaDeEntrega;
    }
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public float getPuntajeMaximo() {
        return puntajeMaximo;
    }
    public void setPuntajeMaximo(float puntajeMaximo) {
        this.puntajeMaximo = puntajeMaximo;
    }
    public float getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
}
