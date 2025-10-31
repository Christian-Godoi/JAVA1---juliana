package EncapsulamentoAtividade;

public class produtoP {

	public static void main(String[] args) {
		 Produto p1 = new Produto();
	        p1.setNome("Mouse");
	        p1.setPreco(79.90);
	        p1.setEstoque(50);

	        Produto p2 = new Produto();
	        p2.setNome("Teclado");
	        p2.setPreco(120);
	        p2.setEstoque(30);

	        System.out.println(p1.getNome() + " - R$" + p1.getPreco() + " - Estoque: " + p1.getEstoque());
	        System.out.println(p2.getNome() + " - R$" + p2.getPreco() + " - Estoque: " + p2.getEstoque());
	    }
	

	}


