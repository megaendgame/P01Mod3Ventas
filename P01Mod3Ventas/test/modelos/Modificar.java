/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import org.junit.Assert;;
import org.junit.Test;

/**
 *
 * @author endga
 */
public class Modificar {

    public Modificar() {
    }
    
    @Test
    public void testModificar(){
        System.out.println("Modificar");
        Venta venta =new Venta ("venta001", 10000,2);
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        boolean esperado = true;
        boolean obtenido = instance.modificar(venta);
        Assert.assertEquals(esperado, obtenido);
        
    }
    
}
