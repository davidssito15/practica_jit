package grupo_4.dao;

import grupo_4.entidades.*;
import java.util.*;
import grupo_4.entidades.*;
import java.util.*;

public interface IEtiquetas_Publicaciones {
    public int insertar (Etiquetas_Publicaciones etiqpublic) throws Exception;
    public int modificar (Etiquetas_Publicaciones etiqpublic) throws Exception; 
    public int eliminar (Etiquetas_Publicaciones etiqpublic) throws Exception;
    public Etiquetas_Publicaciones obtener (long idE, long idP) throws Exception;
    public ArrayList<Etiquetas_Publicaciones> obtener() throws Exception;
}