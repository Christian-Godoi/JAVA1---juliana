package EncapsulamentoAtividade;

public class Carro {
	  private String modelo;
	    private int ano;
	    private int velocidadeAtual;

	    public Carro(String modelo, int ano) {
	        this.modelo = modelo;
	        this.ano = ano;
	        this.velocidadeAtual = 0;
	    }

	    public void acelerar(int valor) {
	        velocidadeAtual += valor;
	    }

	    public void frear(int valor) {
	        velocidadeAtual -= valor;
	        if (velocidadeAtual < 0) {
	            velocidadeAtual = 0;
	        }
	    }

	    public int getVelocidadeAtual() {
	        return velocidadeAtual;
}
}
