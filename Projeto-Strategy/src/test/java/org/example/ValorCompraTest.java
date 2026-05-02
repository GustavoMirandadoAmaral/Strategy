package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValorCompraTest {

    @Test
    void deveSomarFreteEspecialEValorCarrinho(){
        ValorCompra valorCompra = new ValorCompra();
        valorCompra.somarFreteEspecial(100.0f, 20.0f);
    }

    @Test
    void deveSomarFretePadraoEValorCarrinho(){
        ValorCompra valorCompra = new ValorCompra();
        valorCompra.somarFretePadrao(100.0f, 10.0f);
    }

    @Test
    void deveSomarFreteRetiradaEValorCarrinho(){
        ValorCompra valorCompra = new ValorCompra();
        valorCompra.somarFreteRetirada(100.0f, 0.0f);
    }
}