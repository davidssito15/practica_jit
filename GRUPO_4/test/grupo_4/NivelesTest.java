package grupo_4;
import grupo_4.accesodatos.*;
import grupo_4.dao.*;
import grupo_4.entidades.*;
import grupo_4.impl.*;
import org.junit.Test;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class NivelesTest {
    
    public NivelesTest() {
    }
     @Test
    public void testGeneral(){
        INiveles nivelDao=new ImplNiveles();
        
//TEST INSERTAR

        int filas=0;
        Niveles nuevoNivel=new Niveles(5, "sebas", new Date(), new Date());
        try {
            filas=nivelDao.insertar(nuevoNivel);
            System.out.println("filas Insertadas:"+filas+"\n");
        } catch (Exception e) {
        }
        assertEquals(filas>0, true);
        
//TEST OBTENER POR CODIGO
        
        Niveles nive=new Niveles();
        try {
            nive=nivelDao.obtener(1);
            System.out.println(nive.getId()+"    "+nive.getNombre()+"    "+nive.getCreado()+"    "+nive.getActualizado()+"\n");
        } catch (Exception e) {
        }
        
//TEST LISTADO

        ArrayList<Niveles> niveles=new ArrayList<>();
        try {
            niveles=nivelDao.obtener();
            for(Niveles niv:niveles){
                System.out.println(niv.getId()+"\t\t\t"+niv.getNombre()+"\t\t\t"+niv.getCreado()+"\t\t\t"+niv.getActualizado());
            }
        } catch (Exception e) {
        }
        assertTrue(niveles.size()>0);
    }
}