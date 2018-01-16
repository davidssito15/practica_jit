package grupo_4.impl;
import grupo_4.dao.*;
import grupo_4.entidades.*;
import grupo_4.accesodatos.*;
import java.util.*;
import java.sql.*;

public class ImplPublicaciones implements IPublicaciones{
    @Override
    public int insertar(Publicaciones publicacion) throws Exception {
        int numFilas = 0;
        String sqlC = "INSERT INTO Publicacion (id, idUsuario, idNivel, titulo, contenido, publicado, vistas, creado, actualizado, votos) VALUES (?,?,?,?,?,?,?,?,?,?)";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, publicacion.getId()));
        lisParametros.add(new Parametro(2, publicacion.getUsuario().getId()));
        lisParametros.add(new Parametro(3, publicacion.getNivel().getId()));
        lisParametros.add(new Parametro(4, publicacion.getTitulo()));
        lisParametros.add(new Parametro(5, publicacion.getContenido()));
        lisParametros.add(new Parametro(6, publicacion.getPublicado()));
        lisParametros.add(new Parametro(7, publicacion.getVistas()));
        if (publicacion.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(8, new java.sql.Date(((java.util.Date) publicacion.getCreado()).getTime())));
        } else {
            lisParametros.add(new Parametro(8, publicacion.getCreado()));
        }
        if (publicacion.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(9, new java.sql.Date(((java.util.Date) publicacion.getActualizado()).getTime())));
        } else {
            lisParametros.add(new Parametro(9, publicacion.getActualizado()));
        }

        lisParametros.add(new Parametro(10, publicacion.getUsuario().getId()));
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
    public int modificar(Publicaciones publicacion) throws Exception {
        int numFilas = 0;
        String sqlC = "UPDATE Publicacion SET id=?, idUsuario=?, idNivel=?, titulo=?, contenido=?, publicado=?, vistas=?, creado=?, actualizado=?, votos=? WHERE id=?";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, publicacion.getId()));
        lisParametros.add(new Parametro(2, publicacion.getUsuario().getId()));
        lisParametros.add(new Parametro(3, publicacion.getNivel().getId()));
        lisParametros.add(new Parametro(4, publicacion.getTitulo()));
        lisParametros.add(new Parametro(5, publicacion.getContenido()));
        lisParametros.add(new Parametro(6, publicacion.getPublicado()));
        lisParametros.add(new Parametro(7, publicacion.getVistas()));
        if (publicacion.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(8, new java.sql.Date(((java.util.Date) publicacion.getCreado()).getTime())));
        } else {
            lisParametros.add(new Parametro(8, publicacion.getCreado()));
        }
        if (publicacion.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(9, new java.sql.Date(((java.util.Date) publicacion.getActualizado()).getTime())));
        } else {
            lisParametros.add(new Parametro(9, publicacion.getActualizado()));
        }
        lisParametros.add(new Parametro(10, publicacion.getUsuario().getId()));
        lisParametros.add(new Parametro(11, publicacion.getId()));
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
    public int eliminar(Publicaciones publicacion) throws Exception {
        int numFilas = 0;
        String sqlC = "DELETE FROM Publicacion VALUES WHERE id=?";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, publicacion.getId()));
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
    public Publicaciones obtener(long id) throws Exception {
        Publicaciones publica = null;
        String sqlC = "SELECT id, idUsuario, idNivel, titulo, contenido, publicado, vistas, creado, actualizado, votos FROM Publicacion Where id=?";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, id));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            IUsuarios userDao = new ImplUsuarios();
            Usuarios user = null;
            INiveles lvlDao = new ImplNiveles();
            Niveles lvl = new Niveles();
            ResultSet rst = con.ejecutarQuery(sqlC, lisParametros);
            while (rst.next()) {
                publica = new Publicaciones();
                user = new Usuarios();
                lvl = new Niveles();
                publica.setId(rst.getInt(1));
                user = userDao.obtener(rst.getLong(2));
                publica.setUsuario(user);
                lvl = lvlDao.obtener(rst.getLong(3));
                publica.setNivel(lvl);
                publica.setTitulo(rst.getString(4));
                publica.setContenido(rst.getString(5));
                publica.setPublicado(rst.getInt(6));
                publica.setVistas(rst.getInt(7));
                publica.setCreado(rst.getDate(8));
                publica.setActualizado(rst.getDate(9));
                publica.setVotos(rst.getDouble(10));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return publica;
    }

    @Override
    public ArrayList<Publicaciones> obtener() throws Exception {
        Publicaciones publica = null;
        String sqlC = "select id, idUsuario, idNivel, titulo, contenido, publicado, vistas, creado, actualizado, votos from Publicacion";
        ArrayList<Publicaciones> lstPublicacion = new ArrayList<>();
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutarQuery(sqlC, null);
            while (rst.next()) {
                IUsuarios userDao = new ImplUsuarios();
                Usuarios user = null;
                INiveles lvlDao = new ImplNiveles();
                Niveles lvl = new Niveles();
                publica = new Publicaciones();
                user = new Usuarios();
                lvl = new Niveles();
                publica.setId(rst.getInt(1));
                user = userDao.obtener(rst.getLong(2));
                publica.setUsuario(user);
                lvl = lvlDao.obtener(rst.getLong(3));
                publica.setNivel(lvl);
                publica.setTitulo(rst.getString(4));
                publica.setContenido(rst.getString(5));
                publica.setPublicado(rst.getInt(6));
                publica.setVistas(rst.getInt(7));
                publica.setCreado(rst.getDate(8));
                publica.setActualizado(rst.getDate(9));
                publica.setVotos(rst.getDouble(10));
                lstPublicacion.add(publica);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return lstPublicacion;
    }
}