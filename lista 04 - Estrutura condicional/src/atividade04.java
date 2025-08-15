import java.util.Scanner;

public class atividade04 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		
//1
		int idade;
		System.out.println("Qual a sua idade?");
		idade = scanner.nextInt();
		if(idade >= 18) {
			System.out.println("Você é maior de idade");
		} else {
			System.out.println("Você é menor de idade");
		}
	

//2
		int num1, num2;
		System.out.println("Digite um número: ");
		num1 = scanner.nextInt();
		System.out.println("Digite outro número: ");
		num2 = scanner.nextInt();
		if (num1 > num2) {
			System.out.println("O primeiro número é maior");
		} else {
			System.out.println("O segundo número é maior");
		}
		
		
//3
		double nota1;
		System.out.println("Informe sua nota: ");
		nota1 = scanner.nextDouble();
		if (nota1 > 7 ) {
			System.out.println("Aprovado, sua nota foi: " + nota1);
		} else {
			System.out.println("Reprovado, sua nota foi: " + nota1);
		}
		
//4
		double n;
		System.out.println("Escreva um número: ");
		n = scanner.nextDouble();
		if (n > 0) {
			System.out.println("O número é positivo");
		} else {
				System.out.println("O número é negativo ou zero");
			}
		
//5
		int dist;
		System.out.println("Qual a distância de entrega? ");
		dist = scanner.nextInt();
		double f1 = dist*0.5;
		if (dist <= 50) {
			System.out.println("O frete custa 10 reais ");
		} else {
			System.out.println("Valor do frete: R$ " + f1 );
		}
		
//6
		int q;
		System.out.println("Digite um número: ");
		q = scanner.nextInt();
		if(q == 10) {
			System.out.println("O número é 10");
		} else {
			System.out.println("O número não é 10");
		}
		
//7 
		String loja;
		System.out.println("Você é associado da loja? ");
		loja = scanner.next();
		if ( loja == "sim") {
			System.out.println("Você tem desconto");
		}else {
			System.out.println("Você não tem descont");
		}

//8
		int n2;
		System.out.println("Qual o número de horas trabalhadas? ");
		n2 = scanner.nextInt();
		double horas = n2*20;
		if (n2 < 10) {
			System.out.println("Bônus por hora extra: R$ " + horas);
		}else {
			System.out.println("Bônus por hora extra: R$ " + horas);
		}
		
		
		
		
		
	}

}
