package grupo_4.impl;

import grupo_4.accesodatos.*;
import grupo_4.dao.*;
import grupo_4.entidades.*;
import java.util.*;
import java.sql.*;

public class ImplUsuarios implements IUsuarios{

    
    @Override
    public int insertar(Usuarios usuario) throws Exception {
        int numFilas = 0;
        String sqlC = "INSERT INTO Usuario (id, nombre, email, passw, idRol, creado, actualizado) VALUES (?,?,?,?,?,?,?)";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, usuario.getId()));
        lisParametros.add(new Parametro(2, usuario.getNombre()));
        lisParametros.add(new Parametro(3, usuario.getEmail()));
        lisParametros.add(new Parametro(4, usuario.getPassoword()));
        lisParametros.add(new Parametro(5, usuario.getRol().getId()));
        if (usuario.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(6, new java.sql.Date(((java.util.Date) usuario.getCreado()).getTime())));
        } else {
            lisParametros.add(new Parametro(6, usuario.getCreado()));
        }
        if (usuario.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(7, new java.sql.Date(((java.util.Date) usuario.getCreado()).getTime())));
        } else {
            lisParametros.add(new Parametro(7, usuario.getCreado()));
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
    public int modificar(Usuarios usuario) throws Exception {
        int numFilas = 0;
        String sqlC = "UPDATE Usuario SET id=?, nombre=?, email=?, passw=?, idRol=?, creado=?, actualizado=? WHERE id=?";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, usuario.getId()));
        lisParametros.add(new Parametro(2, usuario.getNombre()));
        lisParametros.add(new Parametro(3, usuario.getEmail()));
        lisParametros.add(new Parametro(4, usuario.getPassoword()));
        lisParametros.add(new Parametro(5, usuario.getRol().getId()));
        if (usuario.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(6, new java.sql.Date(((java.util.Date) usuario.getCreado()).getTime())));
        } else {
            lisParametros.add(new Parametro(6, usuario.getCreado()));
        }
        if (usuario.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(7, new java.sql.Date(((java.util.Date) usuario.getCreado()).getTime())));
        } else {
            lisParametros.add(new Parametro(7, usuario.getCreado()));
        }
        lisParametros.add(new Parametro(8, usuario.getId()));
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
    public int eliminar(Usuarios usuario) throws Exception {
        int numFilas = 0;
        String sqlC = "DELETE FROM Usuario WHERE id=?";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, usuario.getId()));
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
    public Usuarios obtener(long id) throws Exception {
        Usuarios nUsuario = null;
        String sqlC = "SELECT id, nombre, email, passw, idRol, creado, actualizado FROM Usuario WHERE id=?";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, id));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutarQuery(sqlC, lisParametros);
            Roles nRol = null;
            IRoles obRol = new ImplRoles();
            while (rst.next()) {
                nRol = new Roles();
                nUsuario = new Usuarios();
                nUsuario.setId(rst.getInt(1));
                nUsuario.setNombre(rst.getString(2));
                nUsuario.setEmail(rst.getString(3));
                nUsuario.setPassoword(rst.getString(4));
                nRol = obRol.obtener(rst.getLong(5));
                nUsuario.setRol(nRol);
                nUsuario.setCreado(rst.getDate(6));
                nUsuario.setActualizado(rst.getDate(7));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return nUsuario;
    }

    @Override
    public ArrayList<Usuarios> obtener() throws Exception {
        ArrayList<Usuarios> listUsuario = new ArrayList<>();
        String sqlC = "SELECT id, nombre, email, passw, idRol, creado, actualizado FROM Usuario";
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutarQuery(sqlC, null);
            Roles nRol = null;
            IRoles obRol = new ImplRoles();
            while (rst.next()) {
                Usuarios nUsuario = new Usuarios();
                nRol = new Roles();
                nUsuario.setId(rst.getInt(1));
                nUsuario.setNombre(rst.getString(2));
                nUsuario.setEmail(rst.getString(3));
                nUsuario.setPassoword(rst.getString(4));
                nRol = obRol.obtener(rst.getLong(5));
                nUsuario.setRol(nRol);
                nUsuario.setCreado(rst.getDate(6));
                nUsuario.setActualizado(rst.getDate(7));
                listUsuario.add(nUsuario);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return listUsuario;
    }
}