
package taller.rnegocio.entidades;

public class Rol {
    private int idroles;
    private String nombre;
    private String creado; 
    private String actualizado;

    
    public Rol() {
    }

    public Rol(int idroles, String nombre, String creado, String actualizado) {
        this.idroles = idroles;
        this.nombre = nombre;
        this.creado = creado;
        this.actualizado = actualizado;
    }

    public int getIdroles() {
        return idroles;
    }

    public void setIdroles(int idroles) {
        this.idroles = idroles;
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
