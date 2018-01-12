package taller.rnegocio.entidades;
import java.sql.Date;
public class Etiquetas_Publicaciones {
    private Etiquetas etiquetas;
    private Publicaciones publicaciones;
    private Date creado ;
    private Date actualizado ;

    public Etiquetas_Publicaciones() {
    }

    public Etiquetas_Publicaciones(Etiquetas etiquetas, Publicaciones publicaciones, Date creado, Date actualizado) {
        this.etiquetas = etiquetas;
        this.publicaciones = publicaciones;
        this.creado = creado;
        this.actualizado = actualizado;
    }

    public Etiquetas getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(Etiquetas etiquetas) {
        this.etiquetas = etiquetas;
    }

    public Publicaciones getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(Publicaciones publicaciones) {
        this.publicaciones = publicaciones;
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