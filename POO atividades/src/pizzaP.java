import java.util.Scanner;

public class pizzaP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 Pizza pizza1 = new Pizza();
		pizza1.sabor = "Calabresa";
        pizza1.tamanho = "Grande";
        

      
        Pizza pizza2 = new Pizza();
        pizza2.sabor = "Frango com Catupiry";
        pizza2.tamanho = "Média";
      

        
        pizza1.preparar();
        pizza1.mostrarInformacoes();
        pizza1.assando();
        pizza1.mostrarInformacoes();
        System.out.println("\n");
        
        pizza2.preparar();
        pizza2.assando();
        pizza2.mostrarInformacoes();

}
}