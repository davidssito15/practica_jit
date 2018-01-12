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
public interface IEtiquetas_Publicaciones {
    public int insertar (Etiquetas_Publicaciones etiquetas_publicaciones) throws Exception;
    public int modificar (Etiquetas_Publicaciones etiquetas_publicaciones) throws Exception; 
    public int eliminar (Etiquetas_Publicaciones  etiquetas_publicaciones) throws Exception;
    public Etiquetas_Publicaciones obtener (String codigo) throws Exception;
    public ArrayList<Etiquetas_Publicaciones> obtener() throws Exception;
    
}
