/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author endga
 */
public class Agregar {

    public Agregar() {
    }
    
    @Test
    public void testAgregar(){
        System.out.println("Agregar");
        Venta venta =new Venta ("venta001", 10000,2);
        ColeccionVentas instance = new ColeccionVentas();
        boolean esperado = true;
        boolean obtenido = instance.Agregar(venta);
        Assert.assertEquals(esperado, obtenido);
        
    }
    
}
