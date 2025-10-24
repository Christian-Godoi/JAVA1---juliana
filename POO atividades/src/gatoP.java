import java.util.Scanner;

public class gatoP {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Gato gato = new Gato();
		
		gato.nome = "Shaudi";
		gato.idade = 10;
		gato.miar();
 
		Gato gigante = new Gato();
		
 System.out.println("Qual o nome do pet?");
 gato.nome = scanner.next();
 System.out.println("Qual a idade?");
 gato.idade = scanner.nextInt();
 


	}

}
