package grupo_4.entidades;

import java.util.*;

public class Roles {
    private long id;
    private String nombre;
    private Date creado; 
    private Date actualizado;

    
    public Roles() {
    }

    public Roles(long id, String nombre, Date creado, Date actualizado) {
        this.id = id;
        this.nombre = nombre;
        this.creado = creado;
        this.actualizado = actualizado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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