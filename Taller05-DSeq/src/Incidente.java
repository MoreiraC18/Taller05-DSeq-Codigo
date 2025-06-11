import java.time.LocalDateTime;
import java.util.List;

public class Incidente {
    protected int id;
    protected LocalDateTime fecha_reportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected List<String> log_actualizaciones;
    protected LocalDateTime fecha_cerrado;
    protected String tipo;
    protected Usuario usuarioResponsable;

    
    public Incidente(int id, LocalDateTime fecha_reportado, String estado, String titulo, String descripcion,
            List<String> log_actualizaciones, LocalDateTime fecha_cerrado, String tipo,Usuario usuarioResponsable) {
        this.id = id;
        this.fecha_reportado = fecha_reportado;
        this.estado = estado;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.log_actualizaciones = log_actualizaciones;
        this.fecha_cerrado = fecha_cerrado;
        this.tipo = tipo;
        this.usuarioResponsable=usuarioResponsable;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDateTime getFecha_reportado() {
        return fecha_reportado;
    }
    public void setFecha_reportado(LocalDateTime fecha_reportado) {
        this.fecha_reportado = fecha_reportado;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public List<String> getLog_actualizaciones() {
        return log_actualizaciones;
    }
    public void setLog_actualizaciones(List<String> log_actualizaciones) {
        this.log_actualizaciones = log_actualizaciones;
    }
    public LocalDateTime getFecha_cerrado() {
        return fecha_cerrado;
    }
    public void setFecha_cerrado(LocalDateTime fecha_cerrado) {
        this.fecha_cerrado = fecha_cerrado;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
