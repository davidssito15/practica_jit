package grupo_4.entidades;
import java.sql.Date;
public class Usuarios {
    private int idusuario;
    private String nombre; 
    private String email;
    private String contraseña;
    private Roles roles; 
    private Date creado;
    private Date actualizado;
    

    public Usuarios() {
    }

    public Usuarios(int idusuario, String nombre, String email, String contraseña, Roles roles, Date creado, Date actualizado) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.roles = roles;
        this.creado = creado;
        this.actualizado = actualizado;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
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