package grupo_4.entidades;
import java.sql.Date;
public class Etiquetas {
    private int idetiquetas;
    private String nombre; 
    private Date creado ;
    private Date actualizado ;

    public Etiquetas() {
    }

    public Etiquetas(int idetiquetas, String nombre, Date creado, Date actualizado) {
        this.idetiquetas = idetiquetas;
        this.nombre = nombre;
        this.creado = creado;
        this.actualizado = actualizado;
    }

    public int getIdetiquetas() {
        return idetiquetas;
    }

    public void setIdetiquetas(int idetiquetas) {
        this.idetiquetas = idetiquetas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getCreado() {
        return creado;
    }

    public void setCreado(Date creado) {
        this.creado = creado;
    }

    public Date getActualizado() {
        return actualizado;
    }

    public void setActualizado(Date actualizado) {
        this.actualizado = actualizado;
    }
 
 
}
