package com.example.project;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FechaTest {

    private Fecha fechaCorrecta = new Fecha(20, 6, 2008);
    private Fecha mesMal1 = new Fecha(21, 0, 3000);
    private Fecha mesMal2 = new Fecha(21, 13, 3000);
    private Fecha diaMal1 = new Fecha(0, 11, 2000);
    private Fecha diaMal2 = new Fecha(32, 11, 2000);
    private Fecha diaMalNoviembre = new Fecha(31, 11, 2000);
    private Fecha diaBienDiciembre = new Fecha(31, 12, 2000);
    private Fecha diaMalFebrero = new Fecha(30, 2, 2008);
    private Fecha diaBienFebreroBisiesto1 = new Fecha(29, 2, 2008);
    private Fecha diaBienFebreroBisiesto2 = new Fecha(29, 2, 2000);
    private Fecha diaMalFebreroBisiesto1 = new Fecha(29, 2, 2007);
    private Fecha diaMalFebreroBisiesto2 = new Fecha(29, 2, 1900);

    
    @Test
    public void testEsFechaValida() {
    	
        assertTrue(fechaCorrecta.esFechaValida());
        assertFalse(mesMal1.esFechaValida());
        assertFalse(mesMal2.esFechaValida());
        assertFalse(diaMal1.esFechaValida());
        assertFalse(diaMal2.esFechaValida());
        assertFalse(diaMalNoviembre.esFechaValida());
        assertTrue(diaBienDiciembre.esFechaValida());
        assertFalse(diaMalFebrero.esFechaValida());
        assertTrue(diaBienFebreroBisiesto1.esFechaValida());
        assertTrue(diaBienFebreroBisiesto2.esFechaValida());
        assertFalse(diaMalFebreroBisiesto1.esFechaValida());
        assertFalse(diaMalFebreroBisiesto2.esFechaValida());
        
    }
}
