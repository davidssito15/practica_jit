package grupo_4.dao;
    import grupo_4.entidades.*;
    import java.util.*;
public interface IRoles {
    public int insertar (Roles rol) throws Exception;
    public int modificar (Roles rol) throws Exception; 
    public int eliminar (Roles rol) throws Exception;
    public Roles obtener (long id) throws Exception;
    public ArrayList<Roles> obtener() throws Exception;
    
}
