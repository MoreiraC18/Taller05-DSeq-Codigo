import java.util.List;

public class Usuario {
    protected String usuario;
    protected String contraseña;
    protected String nombre;
    protected String apellido;
    protected List<Incidente> incidentesReportados;
    
    

    

    public Usuario(String usuario, String contraseña, String nombre, String apellido,
            List<Incidente> incidentesReportados) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.incidentesReportados = incidentesReportados;
    }

    protected boolean logIn(){
        return true;
    }

    protected boolean logOut(){
        return true;
    }



}
