
package grupo_4;
import grupo_4.accesodatos.*;
import grupo_4.dao.*;
import grupo_4.entidades.*;
import grupo_4.impl.*;
import org.junit.Test;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;



public class UsuariosTest {
    
    public UsuariosTest() {
    }
   
    @Test
    public void testGeneral() {
        IUsuarios usuarioDao = new ImplUsuarios();
        
//TEST INSERTAR

        int filas = 0;
        Roles nRol = new Roles(1, "juan", new Date(), new Date());
        Usuarios user = new Usuarios(6, "Gilda", "LOPEZ", "abxx.dj", nRol, new Date(), new Date());
        try {
            filas = usuarioDao.insertar(user);
            System.out.println("filas Insertadas:" + filas);
        } catch (Exception e) {
        }
        assertEquals(filas > 0, true);
        
//TEST OBTENER POR CODIGO

        Usuarios usuario = new Usuarios();
        try {
            usuario = usuarioDao.obtener(874);
            System.out.println(usuario.getId() + "    " + usuario.getNombre() + "    " + usuario.getEmail() + "    " + usuario.getPassoword() + "    " + usuario.getRol().getId() + "    " + usuario.getCreado() + "    " + usuario.getActualizado() + "\n\n");
        } catch (Exception e) {
        }
        //assertEquals(usuario != null, true);
        
//TEST LISTADO

        ArrayList<Usuarios> usuarios = new ArrayList<>();
        try {
            usuarios = usuarioDao.obtener();
            for (Usuarios nUsuario : usuarios) {
                System.out.println(nUsuario.getId()+"\t\t\t"+ nUsuario.getNombre()+"\t\t\t"+nUsuario.getEmail()+"\t\t\t"+nUsuario.getPassoword()+"\t\t\t"+nUsuario.getRol().getId() + "\t\t\t"+nUsuario.getCreado()+"\t\t\t"+nUsuario.getActualizado());
            }
        } catch (Exception e) {
        }
        assertTrue(usuarios.size() > 0);
    }

}
