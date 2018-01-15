package grupo_4.dao;
import grupo_4.entidades.*;
import java.util.*;
public interface IEtiquetas {
     public int insertar (Etiquetas etiqueta) throws Exception;
    public int modificar (Etiquetas etiqueta) throws Exception; 
    public int eliminar (Etiquetas etiqueta) throws Exception;
    public Etiquetas obtener (long id) throws Exception;
    public ArrayList<Etiquetas> obtener() throws Exception;
}