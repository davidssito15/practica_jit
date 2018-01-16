package grupo_4.impl;
import grupo_4.accesodatos.*;
import grupo_4.dao.*;
import grupo_4.entidades.*;
import java.util.*;
import java.sql.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ImplEtiquetas_Publicaciones implements IEtiquetas_Publicaciones{
    
@Override
    public int insertar(Etiquetas_Publicaciones etiqpublic) throws Exception {
        int numFilas = 0;
        String sqlC = "INSERT INTO EtiquetaPublicacion (idEtiqueta, idPublicacion, creado, actualizado) VALUES (?,?,?,?)";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
       
        lisParametros.add(new Parametro(1, etiqpublic.getEtiqueta().getId()));
        lisParametros.add(new Parametro(2, etiqpublic.getPublicacion().getId()));
        
        if (etiqpublic.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(3, new java.sql.Date(((java.util.Date) etiqpublic.getCreado()).getTime())));
        } else {
            lisParametros.add(new Parametro(3, etiqpublic.getCreado()));
        }
        if (etiqpublic.getActualizado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(4, new java.sql.Date(((java.util.Date) etiqpublic.getActualizado()).getTime())));
        } else {
            lisParametros.add(new Parametro(4, etiqpublic.getActualizado()));
        }
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            numFilas = con.ejecutarComando(sqlC, lisParametros);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() + " " + e.getLocalizedMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return numFilas;
    }

    @Override
    public int modificar(Etiquetas_Publicaciones etiqpublic) throws Exception {
        int numFilas = 0;
        String sqlC = "UPDATE EtiquetaPublicacion SET idEtiqueta=?, idPublicacion=?, creado=?, actualizado=? WHERE idEtiqueta=? and idPublicacion=?";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, etiqpublic.getEtiqueta().getId()));
        lisParametros.add(new Parametro(2, etiqpublic.getPublicacion().getId()));
        if (etiqpublic.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(3, new java.sql.Date(((java.util.Date) etiqpublic.getCreado()).getTime())));
        } else {
            lisParametros.add(new Parametro(3, etiqpublic.getCreado()));
        }
        if (etiqpublic.getCreado() instanceof java.util.Date) {
            lisParametros.add(new Parametro(4, new java.sql.Date(((java.util.Date) etiqpublic.getActualizado()).getTime())));
        } else {
            lisParametros.add(new Parametro(4, etiqpublic.getActualizado()));
        }
        lisParametros.add(new Parametro(5, etiqpublic.getEtiqueta().getId()));
        lisParametros.add(new Parametro(6, etiqpublic.getPublicacion().getId()));
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
    public int eliminar(Etiquetas_Publicaciones etiqpublic) throws Exception {
        int filas = 0;
        String sqlC = "DELETE FROM EtiquetaPublicacion  WHERE idEtiqueta=? and idPublicacion=?";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, etiqpublic.getEtiqueta().getId()));
        lisParametros.add(new Parametro(2, etiqpublic.getPublicacion().getId()));
        Conexion con = null;
        try {
            con = new Conexion();
            con.conectar();
            filas = con.ejecutarComando(sqlC, lisParametros);
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return filas;
    }

    @Override
    public Etiquetas_Publicaciones obtener(long idE, long idP) throws Exception {
        Etiquetas_Publicaciones eticpublic = null;
        String sqlC = "select idEtiqueta, idPublicacion, creado, actualizado from EtiquetaPublicacion Where idEtiqueta=? and idPublicacion=?";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, idE));
        lisParametros.add(new Parametro(2, idP));
        Conexion con = null;
        try {
            con=new Conexion();
            con.conectar();
            IEtiquetas etiqDao = new ImplEtiquetas();
            Etiquetas etiq = null;
            IPublicaciones publicDao = new ImplPublicaciones();
            Publicaciones publica = null;
            ResultSet rst = con.ejecutarQuery(sqlC, lisParametros);
            while (rst.next()) {
                eticpublic=new Etiquetas_Publicaciones();
                etiq=new Etiquetas();
                etiq=etiqDao.obtener(rst.getLong(1));
                eticpublic.setEtiqueta(etiq);
                publica=new Publicaciones();
                publica=publicDao.obtener(rst.getLong(2));
                eticpublic.setPublicacion(publica);
                eticpublic.setCreado(rst.getDate(3));
                eticpublic.setActualizado(rst.getDate(4));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return eticpublic;
    }

    @Override
    public ArrayList<Etiquetas_Publicaciones> obtener() throws Exception {
        ArrayList<Etiquetas_Publicaciones> etiqpublics=new ArrayList<>();
        Etiquetas_Publicaciones eticpublic = null;
        String sqlC = "select idEtiqueta, idPublicacion, creado, actualizado from EtiquetaPublicacion";
        Conexion con = null;
        try {
            con=new Conexion();
            con.conectar();
            IEtiquetas etiqDao = new ImplEtiquetas();
            Etiquetas etiq = null;
            IPublicaciones publicDao = new ImplPublicaciones();
            Publicaciones publica = null;
            ResultSet rst = con.ejecutarQuery(sqlC, null);
            while (rst.next()) {
                eticpublic=new Etiquetas_Publicaciones();
                etiq=new Etiquetas();
                etiq=etiqDao.obtener(rst.getLong(1));
                eticpublic.setEtiqueta(etiq);
                publica=new Publicaciones();
                publica=publicDao.obtener(rst.getLong(2));
                eticpublic.setPublicacion(publica);
                eticpublic.setCreado(rst.getDate(3));
                eticpublic.setActualizado(rst.getDate(4));
                etiqpublics.add(eticpublic);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return etiqpublics;
    }
}

