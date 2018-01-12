package taller.rnegocio.entidades;
import java.sql.Date;

public class Niveles {
    private int idniveles;
    private String nombre;
    private Date creado;
    private Date actulizado;

    public Niveles() {
    }

    public Niveles(int idniveles, String nombre, Date creado, Date actulizado) {
        this.idniveles = idniveles;
        this.nombre = nombre;
        this.creado = creado;
        this.actulizado = actulizado;
    }

    public int getIdniveles() {
        return idniveles;
    }

    public void setIdniveles(int idniveles) {
        this.idniveles = idniveles;
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

    public Date getActulizado() {
        return actulizado;
    }

    public void setActulizado(Date actulizado) {
        this.actulizado = actulizado;
    }
}