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
public interface IRoles {
    public int insertar (Roles roles) throws Exception;
    public int modificar (Roles roles) throws Exception; 
    public int eliminar (Roles roles) throws Exception;
    public Roles obtener (String codigo) throws Exception;
    public ArrayList<Roles> obtener() throws Exception;
    
}
