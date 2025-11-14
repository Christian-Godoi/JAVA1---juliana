package polimorfismoAtividade;

public class CartaoCredito extends Pagamento{

	@Override
	public void  processarPagamento() {
		System.out.println("Cartão de crédito aceito!");
	}
}
