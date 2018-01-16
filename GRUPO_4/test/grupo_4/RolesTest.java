package grupo_4;
import grupo_4.accesodatos.*;
import grupo_4.dao.*;
import grupo_4.entidades.*;
import grupo_4.impl.*;
import org.junit.Test;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class RolesTest {
    
    public RolesTest() {
    }
    @Test
    public void testGeneral() {
        IRoles rolDao=new ImplRoles();
       
//TEST INSERTAR

        int filas=0;
        Roles nuevoRol=new Roles(10, "lulu", new Date(), new Date());
        try {
            filas=rolDao.insertar(nuevoRol);
            System.out.println("Filas Insertadas:"+filas+"\n\n");
        } catch (Exception e) {
        }
        assertEquals(filas>0, true);
        
//TEST OBTENER POR CODIGO

        Roles role=new Roles();
        try {
            role=rolDao.obtener(2313);
            System.out.println(role.getId()+"    "+role.getNombre()+"    "+role.getCreado()+"    "+role.getActualizado()+"\n");
        } catch (Exception e) {
        }
        
//TEST LISTADO

        ArrayList<Roles> roles=new ArrayList<>();
        try {
            roles=rolDao.obtener();
            for(Roles rol:roles){
                System.out.println(rol.getId()+"\t\t\t"+rol.getNombre()+"\t\t\t"+rol.getCreado()+"\t\t\t"+rol.getActualizado());
            }
        } catch (Exception e) {
        }
        assertTrue(roles.size()>0);
    }
}