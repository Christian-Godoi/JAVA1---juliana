import java.util.Scanner;

public class produtoP {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Produto produto1 = new Produto();
	
    produto1.nome = "Notebook";
    produto1.preco = 3500.00;
    produto1.estoque = 10;

    
    Produto produto2 = new Produto();
    produto2.nome = "Fone de Ouvido";
    produto2.preco = 150.00;
    produto2.estoque = 5;

    
    System.out.println("=== Antes da venda ===");
    produto1.mostrarInformacoes();
    produto2.mostrarInformacoes();

  
    produto1.vender(2); 
    produto2.vender(3); 

   
    System.out.println("=== Após a venda ===");
    produto1.mostrarInformacoes();
    produto2.mostrarInformacoes();
}
}

