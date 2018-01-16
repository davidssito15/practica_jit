package grupo_4;
import grupo_4.accesodatos.*;
import grupo_4.dao.*;
import grupo_4.entidades.*;
import grupo_4.impl.*;
import org.junit.Test;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class PublicacionesTest {
    
    public PublicacionesTest() {
    }
    @Test
    public void testGeneral() {
        IPublicaciones publicDao = new ImplPublicaciones();
        
//TEST INSERTAR

        int filas = 0;
        Roles nRol = new Roles(1, "jose", new Date(), new Date());
        Usuarios user = new Usuarios(1, "Ana", "luz", "ulha", nRol, new Date(), new Date());
        Niveles nuevoNivel=new Niveles(1, "luis", new Date(), new Date());
        Publicaciones pulblicar=new Publicaciones(3, user, nuevoNivel, "HARO", "PULL", 15, 35, 7.5, new Date(), new Date());
        try {
            filas = publicDao.insertar(pulblicar);
            System.out.println("filas Insertadas:" + filas);
        } catch (Exception e) {
        }
        assertEquals(filas > 0, true);
        
//TEST OBTENER POR CODIGO

        Publicaciones publicacion = new Publicaciones();
        try {
            publicacion = publicDao.obtener(1);
            System.out.println(publicacion.getId() + "    " + publicacion.getUsuario().getId()+ "    " + publicacion.getNivel().getId()+ "    " + publicacion.getTitulo()+ "    " + publicacion.getContenido()+ "    " + publicacion.getPublicado()+ "    " + publicacion.getVistas()+ "    " + publicacion.getCreado()+ "    " + publicacion.getActualizado()+ "    " + publicacion.getVotos()+ "\n\n");
        } catch (Exception e) {
        }
        assertEquals(publicacion != null, true);
        
//TEST LISTADO

        ArrayList<Publicaciones> publicaciones = new ArrayList<>();
        try {
            publicaciones = publicDao.obtener();
            for (Publicaciones nPublicacion : publicaciones) {
                System.out.println(nPublicacion.getId() + "\t\t\t" + nPublicacion.getUsuario().getId()+ "\t\t\t" + nPublicacion.getNivel().getId()+ "\t\t\t" + nPublicacion.getTitulo()+ "\t\t\t" + nPublicacion.getContenido()+ "\t\t\t" + nPublicacion.getPublicado()+ "\t\t\t" + nPublicacion.getVistas()+ "\t\t\t" + nPublicacion.getCreado()+ "\t\t\t" + nPublicacion.getActualizado()+ "\t\t\t" + nPublicacion.getVotos());
            }
        } catch (Exception e) {
            System.out.println("error: "+e.getMessage());
        }
        assertTrue(publicaciones.size() > 0);
    }
}