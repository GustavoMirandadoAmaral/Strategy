package org.example;

public class ValorCompra {

    private float valorFinal;

    public float getValorFinal(){
        return valorFinal;
    }

    public void somarFreteEspecial(float valorCarrinho, float valorFrete){
        CalculadorLogistico calculadorLogistico = new CalculadorLogistico(valorCarrinho, valorFrete);
        this.valorFinal = calculadorLogistico.calcular(new FreteEspecial());
    }

    public void somarFretePadrao(float valorCarrinho, float valorFrete){
        CalculadorLogistico calculadorLogistico = new CalculadorLogistico(valorCarrinho, valorFrete);
        this.valorFinal = calculadorLogistico.calcular(new FretePadrao());
    }

    public void somarFreteRetirada(float valorCarrinho, float valorFrete){
        CalculadorLogistico calculadorLogistico = new CalculadorLogistico(valorCarrinho, valorFrete);
        this.valorFinal = calculadorLogistico.calcular(new FretePadrao());
    }

}
