package grupo_4.dao;

    import grupo_4.entidades.*;
    import grupo_4.entidades.*;
    import java.util.*;

public interface IPublicaciones {
    public int insertar (Publicaciones publicacion) throws Exception;
    public int modificar (Publicaciones publicacion) throws Exception; 
    public int eliminar (Publicaciones publicacion) throws Exception;
    public Publicaciones obtener (long id) throws Exception;
    public ArrayList<Publicaciones> obtener() throws Exception;   
}