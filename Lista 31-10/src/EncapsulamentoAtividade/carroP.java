package EncapsulamentoAtividade;

public class carroP {

	public static void main(String[] args) {
		
		 Carro c1 = new Carro("Gol", 2015);

	        c1.acelerar(50);
	        System.out.println("Velocidade: " + c1.getVelocidadeAtual());

	        c1.frear(20);
	        System.out.println("Velocidade: " + c1.getVelocidadeAtual());

	        c1.frear(50);
	        System.out.println("Velocidade: " + c1.getVelocidadeAtual());
	}

}
