
package taller.rnegocio.entidades;

public class Publicaciones {
    private int idpublicaciones;
     private Usuarios usuario;
    private Niveles niveles;
  private String titulo; 
  private String contenido;
  private String publicado; 
  private String vistas;
  private String votos; 
  private String creado;
  private String actualizado; 

    public Publicaciones() {
    }

    public Publicaciones(int idpublicaciones, Usuarios usuario, Niveles niveles, String titulo, String contenido, String publicado, String vistas, String votos, String creado, String actualizado) {
        this.idpublicaciones = idpublicaciones;
        this.usuario = usuario;
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

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
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

    public String getVistas() {
        return vistas;
    }

    public void setVistas(String vistas) {
        this.vistas = vistas;
    }

    public String getVotos() {
        return votos;
    }

    public void setVotos(String votos) {
        this.votos = votos;
    }

    public String getCreado() {
        return creado;
    }

    public void setCreado(String creado) {
        this.creado = creado;
    }

    public String getActualizado() {
        return actualizado;
    }

    public void setActualizado(String actualizado) {
        this.actualizado = actualizado;
    }
  
  

    
}
