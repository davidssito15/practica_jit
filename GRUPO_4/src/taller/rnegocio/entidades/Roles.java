
package taller.rnegocio.entidades;

import java.sql.Date;

public class Roles {
    private int idroles;
    private String nombre;
    private Date creado; 
    private Date actualizado;

    
    public Roles() {
    }

    public Roles(int idroles, String nombre, Date creado, Date actualizado) {
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