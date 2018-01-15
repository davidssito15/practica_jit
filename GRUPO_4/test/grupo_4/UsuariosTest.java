
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
        Roles nRol = new Roles(123, "Jhon", new Date(), new Date());
        Usuarios user = new Usuarios(69, "denis", "coro", "ulha", nRol, new Date(), new Date());
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
        assertEquals(usuario != null, true);
        //TEST LISTADO
        ArrayList<Usuarios> usuarios = new ArrayList<>();
        try {
            usuarios = usuarioDao.obtener();
            for (Usuarios nUsuario : usuarios) {
                System.out.println(nUsuario.getId() + "    " + nUsuario.getNombre() + "    " + nUsuario.getEmail() + "    " + nUsuario.getPassoword() + "    " + nUsuario.getRol().getId() + "    " + nUsuario.getCreado() + "    " + nUsuario.getActualizado());
            }
        } catch (Exception e) {
        }
        assertTrue(usuarios.size() > 0);
    }

//      @Test
//    public void pruebageneral() throws Exception{
//        //              INSERTAR
//        int filasAfectadas =0;
//        IUsuarios usuarioDao = new ImplUsuarios();
//        IRoles rolDao = new ImplRoles();
//        Roles rol = rolDao.obtener(3);
//        Usuarios usuario = new Usuarios(70, "dens", "coro", "ulha", rol, new Date(), new Date());
//        
//        try{
//            filasAfectadas = usuarioDao.insertar(usuario);
//            System.out.println("revision Hecha!!!\n");
//        }catch(Exception e){
//            System.out.println("Error:.. "+e.getMessage());
//        }
// //       assertEquals(filasAfectadas>0, true);
//        
//        //              LISTADO DE PEdido
//        List<Usuarios> lista = new ArrayList<>();
//        try {
//            lista = usuarioDao.obtener();
//            for (Usuarios c:lista){
//                System.out.println("---Datos revicions---");
//                System.out.println(usuario.getId() + "    " + usuario.getNombre() + "    " + usuario.getEmail() + "    " + usuario.getPassoword() + "    " + usuario.getRol().getId() + "    " + usuario.getCreado() + "    " + usuario.getActualizado() + "\n\n");
//
//
//            }
//        } catch (Exception e) {
//            System.out.println("Error:" + e.getMessage());
//        }
//        assertTrue(lista.size()>0);
//    }
}
