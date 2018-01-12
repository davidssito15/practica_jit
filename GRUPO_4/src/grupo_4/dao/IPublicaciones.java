/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo_4.dao;

/**
 *
 * @author Davidssito Campos
 */

    import grupo_4.entidades.*;
    import java.util.*;
public interface IPublicaciones {
    public int insertar (Publicaciones publicaciones) throws Exception;
    public int modificar (Publicaciones publicaciones) throws Exception; 
    public int eliminar (Publicaciones publicaciones) throws Exception;
    public Publicaciones obtener (String codigo) throws Exception;
    public ArrayList<Publicaciones> obtener() throws Exception;
    
}
