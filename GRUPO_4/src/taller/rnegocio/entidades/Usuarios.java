package taller.rnegocio.entidades;
public class Usuarios {
    private int idusuario;
    private String nombre; 
    private String email;
    private String contraseña;
    private Rol rol; 
    private String creado;
    private String actualizado;
    

    public Usuarios() {
    }

    public Usuarios(int idusuario, String nombre, String email, String contraseña, Rol rol, String creado, String actualizado) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.rol = rol;
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

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
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
