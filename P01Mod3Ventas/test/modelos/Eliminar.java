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
public class Eliminar {

    public Eliminar() {
    }
    
    
    @Test
    public void testEliminar(){
        System.out.println("Eliminar");
        String codigo ="venta001";
        Venta venta =new Venta ("venta001", 10000,2);
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        boolean esperado = true;
        boolean obtenido = instance.Eliminar(codigo);
        Assert.assertEquals(esperado, obtenido);
        
    }
    
    
}
