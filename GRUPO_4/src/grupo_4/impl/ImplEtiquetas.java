package grupo_4.impl;
import grupo_4.accesodatos.Conexion;
import grupo_4.accesodatos.Parametro;
import grupo_4.dao.idetiquetas;
import grupo_4.entidades.Etiquetas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ImplEtiquetas extends idetiquetas{

   @Override
    public int insertar(Etiquetas Etiquetas) throws Exception {
        int numFilasAfectadas=0;
        String sql="insert into Etiquetator(cod_Etiquetator,nombre,apellido,especialidad) values (?,?,?,?)";
        List<Parametro>lstPar=new ArrayList<>();
        lstPar.add(new Parametro(1, Etiquetas.getIdetiquetas()));
        lstPar.add(new Parametro(2, Etiquetas.getNombre()));
        lstPar.add(new Parametro(3, Etiquetas.getCreado()));
        lstPar.add(new Parametro(4, Etiquetas.getActualizado()));
  
        Conexion con=null;
        try{
            con=new Conexion();
            con.conectar();
            numFilasAfectadas=con.ejecutaComando(sql, lstPar);
        }catch(Exception e){
            throw e;
        }finally{
            con.desconectar();
        }
        return numFilasAfectadas;
    }

    @Override
    
    public int modificar(Etiquetas Etiquetas) throws Exception {
     return 0;
        
        }

    @Override
    public int eliminar(Etiquetas Etiquetas) throws Exception {
         int numFilasAfectadas=0;
        return numFilasAfectadas;
       }

    @Override
    public Etiquetas obtener(int codigo) throws Exception {
        Etiquetas Etiquetas=null;
        String sql="select cod_Etiquetator,nombre,apellido,especialidad from Etiquetator where cod_Etiquetator=?";
        List<Parametro>lstPar=new ArrayList<>();
        lstPar.add(new Parametro(1,codigo));
        Conexion con=null;
        try{
            con=new Conexion();
            con.conectar();
            ResultSet rst=con.ejecutaQuery(sql,lstPar);
            
            while(rst.next()){
                Etiquetas=new Etiquetas();
                Etiquetas.setIdetiquetas(rst.getInt(1));
                Etiquetas.setNombre(rst.getString(2));
                Etiquetas.setCreado(rst.getDate(3));
                Etiquetas.setActualizado(rst.getDate(4));
             
            }
            
        }catch(Exception e){
            throw e;
        }finally{
            con.desconectar();
        }
        return Etiquetas;
        }

    @Override
    public List<Etiquetas> obtener() throws Exception {
        List<Etiquetas> lista=new ArrayList<>();
        String sql="select cod_Etiquetator,nombre,apellido,especialidad from Etiquetator";
        Conexion con=null;
        try{
            con=new Conexion();
            con.conectar();
            ResultSet rst=con.ejecutaQuery(sql,null);
            Etiquetas Etiquetas=null;
            while(rst.next()){
                Etiquetas=new Etiquetas();
                Etiquetas.setIdetiquetas(rst.getInt(1));
                Etiquetas.setNombre(rst.getString(2));
                Etiquetas.setCreado(rst.getDate(3));
                Etiquetas.setActualizado(rst.getDate(4));
                lista.add(Etiquetas);
                           }
            for(Etiquetas Etiqueta :lista){
             System.out.println("__________________\nDOCTORES INGRESADOS SON :\n"
                     + "CODIGO :" +Etiqueta.getIdetiquetas()+"\nNOMBRE : "+Etiqueta.getNombre()
             +"\nAPELLIDO : "+Etiqueta.getCreado()+"\nESPECIALIDAD : "+Etiqueta.getActualizado());
            }
            
        }catch(SQLException e){
            throw e;
        }finally{
            con.desconectar();
        }
        return lista;
    }
  
}
