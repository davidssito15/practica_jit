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
public interface IUsuarios {
     public int insertar (Usuarios usuarios) throws Exception;
    public int modificar (Usuarios usuarios) throws Exception; 
    public int eliminar (Usuarios usuarios) throws Exception;
    public Usuarios obtener (String codigo) throws Exception;
    public ArrayList<Usuarios> obtener() throws Exception;
    
}
