package org.example;

public class FretePadrao implements CalculoFrete {

    public float calcular(float valorCarrinho, float valorFrete) {
        return (valorCarrinho + valorFrete);
    }
}
