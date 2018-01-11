package taller.rnegocio.entidades;

public class Etiquetas {
  private int idetiqueta;
  private String nombre; 
  private String creado ;
  private String actualizado;
  

    public Etiquetas() {
    }

    public Etiquetas(int idetiqueta, String nombre, String creado, String actualizado) {
        this.idetiqueta = idetiqueta;
        this.nombre = nombre;
        this.creado = creado;
        this.actualizado = actualizado;
    }

    public int getIdetiqueta() {
        return idetiqueta;
    }

    public void setIdetiqueta(int idetiqueta) {
        this.idetiqueta = idetiqueta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
