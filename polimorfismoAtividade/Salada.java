package polimorfismoAtividade;

public class Salada extends Conta{

	@Override
	public void calcularPreco() {
		System.out.println("O preço da salada é R$8.00");
	}
}
