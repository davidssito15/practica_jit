package grupo_4.entidades;

import java.util.*;
public class Etiquetas_Publicaciones {
    private Etiquetas etiqueta;
    private Publicaciones publicacion;
    private Date creado;
    private Date actualizado;

    public Etiquetas_Publicaciones() {
    }

    public Etiquetas_Publicaciones(Etiquetas etiqueta, Publicaciones publicacion, Date creado, Date actualizado) {
        this.etiqueta = etiqueta;
        this.publicacion = publicacion;
        this.creado = creado;
        this.actualizado = actualizado;
    }

    public Etiquetas getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(Etiquetas etiqueta) {
        this.etiqueta = etiqueta;
    }

    public Publicaciones getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicaciones publicacion) {
        this.publicacion = publicacion;
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