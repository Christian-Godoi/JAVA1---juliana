
public class Produto {

	String nome;
	double preco;
	int estoque;
	
	void vender(int quantidade) {
		if(estoque <= quantidade) {

		System.out.println("Venda realizada!" + quantidade +"unidades de " + nome+ "vendidas");
		}
		System.out.println("Estoque insuficiente");
	}
	void mostrarInformacoes() {
		 System.out.println("Produto: " + nome);
	        System.out.println("Preço: R$" + preco);
	        System.out.println("Estoque disponível: " + estoque + " unidades");
	        System.out.println("-------------------------");
	}
}
