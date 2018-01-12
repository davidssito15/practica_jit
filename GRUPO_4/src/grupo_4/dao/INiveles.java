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

public interface INiveles {
    public int insertar (Niveles niveles) throws Exception;
    public int modificar (Niveles niveles) throws Exception; 
    public int eliminar (Niveles niveles) throws Exception;
    public Niveles obtener (String codigo) throws Exception;
    public ArrayList<Niveles> obtener() throws Exception;
}
