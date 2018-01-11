/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.rnegocio.entidades;

import java.sql.Date;

/**
 *
 * @author Segovia
 */
public class nivel {
    private String nombre;
    private Date crear;
    private Date actulizar;

    public nivel() {
    }

    public nivel(String nombre, Date crear, Date actulizar) {
        this.nombre = nombre;
        this.crear = crear;
        this.actulizar = actulizar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getCrear() {
        return crear;
    }

    public void setCrear(Date crear) {
        this.crear = crear;
    }

    public Date getActulizar() {
        return actulizar;
    }

    public void setActulizar(Date actulizar) {
        this.actulizar = actulizar;
    }
    
    
}
