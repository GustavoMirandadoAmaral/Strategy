package org.example;

public class CalculadorLogistico {

    private float valorCarrinho;
    private float valorFrete;

    public CalculadorLogistico(float valorCarrinho, float valorFrete ){
        this.valorCarrinho = valorCarrinho;
        this.valorFrete = valorFrete;
    }

    public float calcular(CalculoFrete calculoFrete){
        return calculoFrete.calcular(valorCarrinho, valorFrete);
    }
}
