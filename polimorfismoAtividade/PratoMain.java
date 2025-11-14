package polimorfismoAtividade;

public class PratoMain {

	public static void main(String[] args) {
		
		Conta p1 = new Pizza();
		Conta p2 = new Lasanha();
		Conta p3 = new Salada();
		
		p1.calcularPreco();
		p2.calcularPreco();
		p3.calcularPreco();

	}

}
