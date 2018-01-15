
package grupo_4.dao;

import grupo_4.entidades.*;
import java.util.*;

public interface INiveles {
    public int insertar (Niveles nivel) throws Exception;
    public int modificar (Niveles nivel) throws Exception; 
    public int eliminar (Niveles nivel) throws Exception;
    public Niveles obtener (long id) throws Exception;
    public ArrayList<Niveles> obtener() throws Exception;
}
