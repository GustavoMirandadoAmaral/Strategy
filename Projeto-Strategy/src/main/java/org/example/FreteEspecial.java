package org.example;

public class FreteEspecial implements CalculoFrete{

    public float calcular(float valorCarrinho, float valorFrete) {
        return (valorCarrinho + 1.5f * (valorFrete));
    }
}
