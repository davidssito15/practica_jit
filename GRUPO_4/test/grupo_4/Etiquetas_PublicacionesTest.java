package grupo_4;
import grupo_4.accesodatos.*;
import grupo_4.accesodatos.*;
import grupo_4.dao.*;
import grupo_4.entidades.*;
import grupo_4.impl.*;
import org.junit.Test;
import java.util.*;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.*;

public class Etiquetas_PublicacionesTest {
    
    public Etiquetas_PublicacionesTest() {
    }
    @Test
    public void testGeneral() {
        IEtiquetas_Publicaciones etiqPublicDao = new ImplEtiquetas_Publicaciones();
        //TEST INSERTAR
//        int filas = 0;
//        Etiquetas etiq=new Etiquetas(864, "sebas", new Date(), new Date());
//        Roles nRol = new Roles(123, "Jhon", new Date(), new Date());
//        Usuarios user = new Usuarios(973, "Mishell", "Viteri", "ulha", nRol, new Date(), new Date());
//        Niveles nuevoNivel=new Niveles(222, "jhon", new Date(), new Date());
//        Publicaciones pulblicar=new Publicaciones(349, user, nuevoNivel, "123532", "ljsr", 15, 35, 7.5, new Date(), new Date());
//        Etiquetas_Publicaciones nEtiqPublic=new Etiquetas_Publicaciones(etiq, pulblicar,new Date(), new Date());
//        try {
//            filas = etiqPublicDao.insertar(nEtiqPublic);
//            System.out.println("filas Insertadas:" + filas);
//        } catch (Exception e) {
//        }
//        assertEquals(filas > 0, true);
//        TEST OBTENER POR CODIGO
        Etiquetas_Publicaciones etiqPubli = new Etiquetas_Publicaciones();
        try {
            etiqPubli = etiqPublicDao.obtener(1719,2345);
            System.out.println(etiqPubli.getEtiqueta().getId()+ "    " + etiqPubli.getPublicacion().getId()+ "    " + etiqPubli.getCreado()+ "    " + etiqPubli.getActualizado()+ "\n\n");
        } catch (Exception e) {
        }
        assertEquals(etiqPubli != null, true);
        //TEST LISTADO
        ArrayList<Etiquetas_Publicaciones> etiqPublies = new ArrayList<>();
        try {
            etiqPublies = etiqPublicDao.obtener();
            for (Etiquetas_Publicaciones etiPubli : etiqPublies) {
                System.out.println(etiPubli.getEtiqueta().getId()+ "    " + etiPubli.getPublicacion().getId()+ "    " + etiqPubli.getCreado()+ "    " + etiqPubli.getActualizado());
            }
        } catch (Exception e) {
            System.out.println("error: "+e.getMessage());
        }
        assertTrue(etiqPublies.size() > 0);
    }
}
