package grupo_4.dao;
    import grupo_4.entidades.*;
    import java.util.*;
public interface IUsuarios {
    public int insertar (Usuarios usuario) throws Exception;
    public int modificar (Usuarios usuario) throws Exception; 
    public int eliminar (Usuarios usuario) throws Exception;
    public Usuarios obtener (long id) throws Exception;
    public ArrayList<Usuarios> obtener() throws Exception;
    
}