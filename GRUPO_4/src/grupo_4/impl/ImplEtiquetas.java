package grupo_4.impl;
import grupo_4.accesodatos.*;
import grupo_4.dao.*;
import grupo_4.entidades.*;
import java.util.*;
import java.sql.*;

public class ImplEtiquetas implements IEtiquetas{
     @Override
    public int insertar(Etiquetas etiqueta) throws Exception {
        int numFilas = 0;
        String sqlC = "INSERT INTO Etiqueta (id, nombre, creado, actualizado) VALUES (?,?,?,?)";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, etiqueta.getId()));
        lisParametros.add(new Parametro(2, etiqueta.getNombre()));
        if (etiqueta.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(3, new java.sql.Date(((java.util.Date) etiqueta.getCreado()).getTime())));
        } else {
            lisParametros.add(new Parametro(3, etiqueta.getCreado()));
        }
        if (etiqueta.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(4, new java.sql.Date(((java.util.Date) etiqueta.getActualizado()).getTime())));
        } else {
            lisParametros.add(new Parametro(4, etiqueta.getActualizado()));
        }
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            numFilas = con.ejecutarComando(sqlC, lisParametros);
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return numFilas;
    }

    @Override
    public int modificar(Etiquetas etiqueta) throws Exception {
        int numFilas = 0;
        String sqlC = "UPDATE Etiqueta SET id=?, nombre=?, creado=? actualizado=? WHERE id=?";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, etiqueta.getId()));
        lisParametros.add(new Parametro(2, etiqueta.getNombre()));
        if (etiqueta.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(3, new java.sql.Date(((java.util.Date) etiqueta.getCreado()).getTime())));
        } else {
            lisParametros.add(new Parametro(3, etiqueta.getCreado()));
        }
        if (etiqueta.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(4, new java.sql.Date(((java.util.Date) etiqueta.getActualizado()).getTime())));
        } else {
            lisParametros.add(new Parametro(4, etiqueta.getActualizado()));
        }
        lisParametros.add(new Parametro(5, etiqueta.getId()));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            numFilas = con.ejecutarComando(sqlC, lisParametros);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return numFilas;
    }

    @Override
    public int eliminar(Etiquetas etiqueta) throws Exception {
        int numFilas = 0;
        String sqlC = "DELETE FROM Etiqueta WHERE id=?";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, etiqueta.getId()));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            numFilas = con.ejecutarComando(sqlC, lisParametros);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return numFilas;
    }

    @Override
    public Etiquetas obtener(long id) throws Exception {
        Etiquetas elEtiqueta = null;
        String sqlC = "SELECT id, nombre, creado, actualizado FROM Etiqueta Where id=?";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, id));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutarQuery(sqlC, lisParametros);
            while (rst.next()) {
                elEtiqueta = new Etiquetas();
                elEtiqueta.setId(rst.getInt(1));
                elEtiqueta.setNombre(rst.getString(2));
                elEtiqueta.setCreado(rst.getDate(3));
                elEtiqueta.setActualizado(rst.getDate(4));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return elEtiqueta;
    }

    @Override
    public ArrayList<Etiquetas> obtener() throws Exception {
        ArrayList<Etiquetas> listEtiqueta = new ArrayList<>();
        Etiquetas nEtiqueta = null;
        String sqlC = "Select id, nombre, creado, actualizado from Etiqueta";
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutarQuery(sqlC, null);
            while (rst.next()) {
                nEtiqueta = new Etiquetas();
                nEtiqueta.setId(rst.getInt(1));
                nEtiqueta.setNombre(rst.getString(2));
                nEtiqueta.setCreado(rst.getDate(3));
                nEtiqueta.setActualizado(rst.getDate(4));
                listEtiqueta.add(nEtiqueta);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return listEtiqueta;
    }
}