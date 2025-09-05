import java.util.Scanner;

public class lista09 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//1
		int numero = 1;
		while (numero <= 10) {
			System.out.println(numero);
			numero++;
		}

//2
		int numero1 = 10;
		while (numero1 >= 1) {
			System.out.println(numero1);
			numero1--;	
		}
		
//3
		int numero2 = 0;
		while (numero2 <= 100) {
			System.out.println(numero2);
			numero2+=5;	
		}
		
//4
		int numero3 = 1;
		while (numero3 <= 5) {
			System.out.println("Eu gosto de Java");
			numero3++;
		}

//5
		int soma = 0;
		int valor;
		int conta = 1;

		System.out.println("Digite 5 números: ");
		while(conta <= 5) {
			valor = scanner.nextInt();
			soma += valor;
			conta += 1;
		}
		System.out.println("A soma dos números é: " + soma);
		
//6
		System.out.println("Digite a senha ");
		int senha = scanner.nextInt();
		
		while(senha != 1234) {
			System.out.println("Digite a senha novamente");
			senha = scanner.nextInt();
		}
		System.out.println("A senha está correta");
	
//7
		System.out.println("Digite um número positivo: ");
		int n = scanner.nextInt();
		while (n >= 1) {
			System.out.println(n);
			n--;	

		}
		
		
		
		
		
		
		
		
		
	}

}
