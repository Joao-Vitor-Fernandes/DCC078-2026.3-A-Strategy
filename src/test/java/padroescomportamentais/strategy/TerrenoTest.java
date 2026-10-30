package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TerrenoTest {

    @Test
    void deveCalcularAreaRetangular() {
        Terreno terreno = new Terreno();
        terreno.calcularAreaRetangular(25.0, 12.0);
        assertEquals(300.0, terreno.getArea(), 0.01);
    }

    @Test
    void deveCalcularAreaQuadrado() {
        Terreno terreno = new Terreno();
        terreno.calcularAreaRetangular(12.0, 12.0);
        assertEquals(144.0, terreno.getArea(), 0.01);
    }

    @Test
    void deveCalcularAreaTriangular() {
        Terreno terreno = new Terreno();
        terreno.calcularAreaTriangular(20.0, 15.0);
        assertEquals(150.0, terreno.getArea(), 0.01);
    }

    @Test
    void deveCalcularAreaLosango() {
        Terreno terreno = new Terreno();
        terreno.calcularAreaLosango(30.0, 12.0);
        assertEquals(180.0, terreno.getArea(), 0.01);
    }

    @Test
    void deveCalcularAreaElipse() {
        Terreno terreno = new Terreno();
        terreno.calcularAreaElipse(10.0, 5.0);
        assertEquals(157.08, terreno.getArea(), 0.01);
    }

    @Test
    void deveCalcularAreaElipseCircular() {
        Terreno terreno = new Terreno();
        terreno.calcularAreaElipse(10.0, 10.0);
        assertEquals(314.16, terreno.getArea(), 0.01);
    }

    @Test
    void naoDeveCalcularAreaComPrimeiraMedidaMenorOuIgualQueZero() {
        try {
            Terreno terreno = new Terreno();
            terreno.calcularAreaRetangular(0.0, 10.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Medidas devem ser maiores que zero", e.getMessage());
        }
    }

    @Test
    void naoDeveCalcularAreaComSegundaMedidaMenorOuIgualQueZero() {
        try {
            Terreno terreno = new Terreno();
            terreno.calcularAreaTriangular(10.0, 0.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Medidas devem ser maiores que zero", e.getMessage());
        }
    }

}
