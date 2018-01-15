
package grupo_4.impl;

import grupo_4.accesodatos.*;
import grupo_4.dao.*;
import grupo_4.entidades.*;
import java.util.*;
import java.sql.*;

public class ImplNiveles implements INiveles{
     @Override
    public int insertar(Niveles nivel) throws Exception {
        int numFilas = 0;
        String sqlC = "INSERT INTO Nivel (id, nombre, creado, actualizado) VALUES (?,?,?,?)";
        ArrayList<Parametro> lisParametros = new ArrayList<>();
        lisParametros.add(new Parametro(1, nivel.getId()));
        lisParametros.add(new Parametro(2, nivel.getNombre()));
        if(nivel.getCreado() instanceof java.util.Date){
            lisParametros.add(new Parametro(3, new java.sql.Date(((java.util.Date) nivel.getCreado()).getTime())));
        }
        else{
            lisParametros.add(new Parametro(3, nivel.getCreado()));
        }
        if(nivel.getCreado() instanceof java.util.Date){
            lisParametros.add(new Parametro(4, new java.sql.Date(((java.util.Date) nivel.getActualizado()).getTime())));
        }
        else{
            lisParametros.add(new Parametro(4, nivel.getActualizado()));
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
    public int modificar(Niveles nivel) throws Exception {
        int numFilas = 0;
        String sqlC="UPDATE Nivel SET id=?, nombre=?, creado=? actualizado=? WHERE id=?";
        ArrayList<Parametro> lisParametros=new ArrayList<>();
        lisParametros.add(new Parametro(1, nivel.getId()));
        lisParametros.add(new Parametro(2, nivel.getNombre()));
        if(nivel.getCreado() instanceof java.util.Date){
            lisParametros.add(new Parametro(3, new java.sql.Date(((java.util.Date) nivel.getCreado()).getTime())));
        }
        else{
            lisParametros.add(new Parametro(3, nivel.getCreado()));
        }
        if(nivel.getCreado() instanceof java.util.Date){
            lisParametros.add(new Parametro(4, new java.sql.Date(((java.util.Date) nivel.getActualizado()).getTime())));
        }
        else{
            lisParametros.add(new Parametro(4, nivel.getActualizado()));
        }
        lisParametros.add(new Parametro(5, nivel.getId()));
        Conexion con = null;
        try {
            con=new Conexion();
            con.conectar();
            numFilas=con.ejecutarComando(sqlC, lisParametros);
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        } finally {
            if (con!= null) {
                con.desconectar();
            }
        }
        return numFilas;
    }

    @Override
    public int eliminar(Niveles nivel) throws Exception {
        int numFilas = 0;
        String sqlC="DELETE FROM Nivel WHERE id=?";
        ArrayList<Parametro> lisParametros=new ArrayList<>();
        lisParametros.add(new Parametro(1, nivel.getId()));
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
    public Niveles obtener(long id) throws Exception {
        Niveles elNivel = null;
        String sqlC="SELECT id, nombre, creado, actualizado FROM Nivel Where id=?";
        ArrayList<Parametro> lisParametros=new ArrayList<>();
        lisParametros.add(new Parametro(1, id));
        Conexion con=null;
        try {
            con=new Conexion();
            con.conectar();
            ResultSet rst=con.ejecutarQuery(sqlC, lisParametros);
            while (rst.next()){
                elNivel=new Niveles();
                elNivel.setId(rst.getInt(1));
                elNivel.setNombre(rst.getString(2));
                elNivel.setCreado(rst.getDate(3));
                elNivel.setActualizado(rst.getDate(4));
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return elNivel;
    }

    @Override
    public ArrayList<Niveles> obtener() throws Exception {
        ArrayList<Niveles> listNivel = new ArrayList<>();
        Niveles nNivel=null;
        String sqlC="Select id, nombre, creado, actualizado from Nivel";
        Conexion con=null;
        try {
            con=new Conexion();
            con.conectar();
            ResultSet rst=con.ejecutarQuery(sqlC, null);
            while (rst.next()){
                nNivel=new Niveles();
                nNivel.setId(rst.getInt(1));
                nNivel.setNombre(rst.getString(2));
                nNivel.setCreado(rst.getDate(3));
                nNivel.setActualizado(rst.getDate (4));
                listNivel.add(nNivel);
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        } finally {
            if (con != null) {
                con.desconectar();
            }
        }
        return listNivel;
    }

}

