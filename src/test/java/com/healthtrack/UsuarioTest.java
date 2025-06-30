package com.healthtrack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {

//    @Test
//    public void testactualizarPeso() {
//        Usuario user = new Usuario("Ana", 70.0);
//        user.actualizarPeso(68.5);
//        assertEquals(68.5, user.getPeso(), 0.01);
//    }

    @Test
    public void testCorrectoActualizarPeso() {
        Usuario user = new Usuario("Pedro", 78.0);
        user.correctoActualizarPeso(70.0);
        assertEquals(70.0, user.getPeso(), 0.01);
    }
}
