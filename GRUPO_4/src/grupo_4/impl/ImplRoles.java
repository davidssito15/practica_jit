package grupo_4.impl;
    import grupo_4.accesodatos.*;
    import grupo_4.dao.*;
    import grupo_4.entidades.*;
    import java.util.*;
    import java.sql.*;
public class ImplRoles implements IRoles{
      @Override
    public int insertar(Roles rol) throws Exception {
        int numFilas = 0;
        String sqlC = "INSERT INTO Rol (id, nombre, creado, actualizado) VALUES (?,?,?,?)";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, rol.getId()));
        lisParametros.add(new Parametro(2, rol.getNombre()));
        if(rol.getCreado() instanceof java.util.Date){
            lisParametros.add(new Parametro(3, new java.sql.Date(((java.util.Date) rol.getCreado()).getTime())));
        }
        else{
            lisParametros.add(new Parametro(3, rol.getCreado()));
        }
        if(rol.getCreado() instanceof java.util.Date){
            lisParametros.add(new Parametro(4, new java.sql.Date(((java.util.Date) rol.getActualizado()).getTime())));
        }
        else{
            lisParametros.add(new Parametro(4, rol.getActualizado()));
        }
        Conexion con = null;
        try {
            con=new Conexion();
            con.conectar();
            numFilas=con.ejecutarComando(sqlC, lisParametros);
        } catch (Exception e) {
            System.out.println("error: "+e.getMessage());
        } finally {
            if(con!=null){
                con.desconectar();
            }
        }
        return numFilas;
    }

    @Override
    public int modificar(Roles rol) throws Exception {
        int numFilas = 0;
        String sqlC="UPDATE Rol SET id=?, nombre=?, creado=?  actualizado=?  WHERE id=?";
        ArrayList<Parametro> lisParametros=new ArrayList<>();
        lisParametros.add(new Parametro(1, rol.getId()));
        lisParametros.add(new Parametro(2, rol.getNombre()));
        if(rol.getCreado() instanceof java.util.Date){
            lisParametros.add(new Parametro(3, new java.sql.Date(((java.util.Date) rol.getCreado()).getTime())));
        }
        else{
            lisParametros.add(new Parametro(3, rol.getCreado()));
        }
        if(rol.getCreado() instanceof java.util.Date){
            lisParametros.add(new Parametro(4, new java.sql.Date(((java.util.Date) rol.getActualizado()).getTime())));
        }
        else{
            lisParametros.add(new Parametro(4, rol.getActualizado()));
        }
        lisParametros.add(new Parametro(5, rol.getId()));
        Conexion con=null;
        try {
            con=new Conexion();
            con.conectar();
            numFilas=con.ejecutarComando(sqlC, lisParametros);
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return numFilas;
    }

    @Override
    public int eliminar(Roles rol) throws Exception {
        int numFilas = 0;
        String sqlC="DELETE FROM Rol WHERE id=?";
        ArrayList<Parametro> lisParametros=new ArrayList<>();
        lisParametros.add(new Parametro(1, rol.getId()));
        Conexion con=null;
        try {
            con=new Conexion();
            con.conectar();
            numFilas=con.ejecutarComando(sqlC, lisParametros);
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return numFilas;
    }

    @Override
    public Roles obtener(long id) throws Exception {
        Roles nRol = null;
        String sqlC="SELECT id, nombre, creado, actualizado FROM Rol Where id=? ";
        ArrayList<Parametro> lisParametros=new ArrayList<>();
        lisParametros.add(new Parametro(1, id));
        Conexion con=null;
        try {
            con=new Conexion();
            con.conectar();
            ResultSet rst=con.ejecutarQuery(sqlC, lisParametros);
            while (rst.next()){
                nRol=new Roles();
                nRol.setId(rst.getInt(1));
                nRol.setNombre(rst.getString(2));
                nRol.setCreado(rst.getDate(3));
                nRol.setActualizado(rst.getDate(4));
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return nRol;
    }

    @Override
    public ArrayList<Roles> obtener() throws Exception {
        ArrayList<Roles> listRol = new ArrayList<>();
        String sqlC="SELECT id, nombre, creado, actualizado FROM Rol";
        Conexion con=null;
        try {
            con=new Conexion();
            con.conectar();
            ResultSet rst=con.ejecutarQuery(sqlC, null);
            while (rst.next()){
                Roles nRol=new Roles();
                nRol.setId(rst.getInt(1));
                nRol.setNombre(rst.getString(2));
                nRol.setCreado(rst.getDate(3));
                nRol.setActualizado(rst.getDate(4));
                listRol.add(nRol);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return listRol;
    }

}
