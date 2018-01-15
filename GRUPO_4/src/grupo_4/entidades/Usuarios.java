package grupo_4.entidades;

import java.util.*;
public class Usuarios {
   
    private long id;
    private String nombre;
    private String email;
    private String passoword;
    private Roles rol;
    private Date creado;
    private Date actualizado;

    public Usuarios() {
    }

    public Usuarios(long id, String nombre, String email, String passoword, Roles rol, Date creado, Date actualizado) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.passoword = passoword;
        this.rol = rol;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassoword() {
        return passoword;
    }

    public void setPassoword(String passoword) {
        this.passoword = passoword;
    }

    public Roles getRol() {
        return rol;
    }

    public void setRol(Roles rol) {
        this.rol = rol;
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