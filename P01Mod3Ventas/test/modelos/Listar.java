/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author endga
 */
public class Listar {

    public Listar() {
    }
    
    
     @Test
    public void testListar(){
        System.out.println("Listar");
        ColeccionVentas  instance = new ColeccionVentas();
        ArrayList<Venta> esperado = new ArrayList<Venta>();
        ArrayList<Venta> obtenido = instance.Listar();
        Assert.assertEquals(esperado, obtenido);
    }
    
}
