package grupo_4;

import grupo_4.accesodatos.*;
import grupo_4.dao.*;
import grupo_4.entidades.*;
import grupo_4.impl.*;
import org.junit.Test;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class EtiquetasTest {
    
    
    public EtiquetasTest() {
    }
    @Test
    public void testGeneral() {
          IEtiquetas etiquetaDao=new ImplEtiquetas();
          
//TEST INSERTAR

        int filas=0;
        Etiquetas nuevoEtiqueta=new Etiquetas(4, "supermaxi", new Date(), new Date());
        try {
            filas=etiquetaDao.insertar(nuevoEtiqueta);
            System.out.println("filas Insertadas:"+filas+"\n");
        } catch (Exception e) {
        }
        assertEquals(filas>0, true);
        
//TEST OBTENER POR CODIGO

        Etiquetas etiquee=new Etiquetas();
        try {
            etiquee=etiquetaDao.obtener(2);
            System.out.println(etiquee.getId()+"    "+etiquee.getNombre()+"    "+etiquee.getCreado()+"    "+etiquee.getActualizado()+"\n");
        } catch (Exception e) {
        }
        
//TEST LISTADO

        ArrayList<Etiquetas> etiquetas=new ArrayList<>();
        try {
            etiquetas=etiquetaDao.obtener();
            for(Etiquetas etiqueta:etiquetas){
                System.out.println(etiqueta.getId()+"\t\t\t"+etiqueta.getNombre()+"\t\t\t"+etiqueta.getCreado()+"\t\t\t"+etiqueta.getActualizado());
            }
        } catch (Exception e) {
        }
        assertTrue(etiquetas.size()>0);
    }
}