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
public interface IEtiquetas {
    public int insertar (Etiquetas etiquetas) throws Exception;
    public int modificar (Etiquetas etiquetas) throws Exception; 
    public int eliminar (Etiquetas etiquetas) throws Exception;
    public Etiquetas obtener (String codigo) throws Exception;
    public ArrayList<Etiquetas> obtener() throws Exception;   
}