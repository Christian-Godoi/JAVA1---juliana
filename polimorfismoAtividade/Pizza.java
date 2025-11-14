package polimorfismoAtividade;

public class Pizza extends Conta{

	@Override
	public void calcularPreco() {
		System.out.println("O preço da pizza é R$42.90");
	}
}
