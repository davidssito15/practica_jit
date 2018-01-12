package taller.rnegocio.entidades;
import java.sql.Date;
public class Publicaciones {
    private int idpublicaciones;
    private Usuarios usuarios;
    private Niveles niveles;
    private String titulo; 
    private String contenido;
    private String publicado; 
    private int vistas;
    private Double votos; 
    private Date creado;
    private Date actualizado; 

    public Publicaciones() {
    }

    public Publicaciones(int idpublicaciones, Usuarios usuarios, Niveles niveles, String titulo, String contenido, String publicado, int vistas, Double votos, Date creado, Date actualizado) {
        this.idpublicaciones = idpublicaciones;
        this.usuarios = usuarios;
        this.niveles = niveles;
        this.titulo = titulo;
        this.contenido = contenido;
        this.publicado = publicado;
        this.vistas = vistas;
        this.votos = votos;
        this.creado = creado;
        this.actualizado = actualizado;
    }

    public int getIdpublicaciones() {
        return idpublicaciones;
    }

    public void setIdpublicaciones(int idpublicaciones) {
        this.idpublicaciones = idpublicaciones;
    }


    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }


    public Niveles getNiveles() {
        return niveles;
    }

    public void setNiveles(Niveles niveles) {
        this.niveles = niveles;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }


    public String getPublicado() {
        return publicado;
    }

    public void setPublicado(String publicado) {
        this.publicado = publicado;
    }


    public int getVistas() {
        return vistas;
    }

    public void setVistas(int vistas) {
        this.vistas = vistas;
    }


    public Double getVotos() {
        return votos;
    }

    public void setVotos(Double votos) {
        this.votos = votos;
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