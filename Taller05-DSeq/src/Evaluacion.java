import java.time.LocalDateTime;

public class Evaluacion extends ActividadSumativa{
    private int limiteDeTiempo;

    

    public Evaluacion(String titulo, LocalDateTime fechaDeEntrega, String contenido, float puntajeMaximo,
            float calificacion, String id, int limiteDeTiempo) {
        super(titulo, fechaDeEntrega, contenido, puntajeMaximo, calificacion, id);
        this.limiteDeTiempo = limiteDeTiempo;
    }

    public int getLimiteDeTiempo() {
        return limiteDeTiempo;
    }

    public void setLimiteDeTiempo(int limiteDeTiempo) {
        this.limiteDeTiempo = limiteDeTiempo;
    }
}
