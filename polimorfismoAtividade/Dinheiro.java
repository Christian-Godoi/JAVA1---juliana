package polimorfismoAtividade;

public class Dinheiro extends Pagamento{

	@Override
	public void  processarPagamento() {
		System.out.println("Você precisa do troco em dinheiro?");
	}
}
