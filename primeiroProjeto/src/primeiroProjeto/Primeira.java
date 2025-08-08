package primeiroProjeto;

import java.util.Scanner;

public class Primeira {

	public static void main(String[] args) {
		System.out.println("Olá Mundo");

//Declaração de variável
		
		int idade = 24;
		double salario = 2000.50;
		char letra = 'C';
		String nome ="Christian";
		boolean chuva = false;
		
		System.out.println(idade);
		System.out.println("O salário é: " + salario + "reais");
		System.out.println("Letra: " + nome);
		System.out.println("O nome é: " + nome);
		System.out.println(chuva);
		

//Operadores
		
		int num1 = 10;
		int num2 = 3;
		double soma = num1 + num2 ;
		double sub = num1 - num2;
		double div = num1 / num2 ;
		double mult = num1 * num2;
		double resto = num1 % num2 ; //Módulo - Resto da divisão
		 
		System.out.println("O valor da soma é: " + soma);
		System.out.println("O valor da subtração é: " + sub);
		System.out.println("O valor da multiplicação é: " + mult);
		System.out.println("O valor da divisão é: " + div);
		System.out.println("O valor do resto é: " + resto);
		
		
//Entrada de Dados
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual seu nome? ");
		String nome1 = scanner.nextLine();
		System.out.println("Olá " + nome1);
		
		
//Soma de dois números
		
		int numero1;
		int numero2;
		System.out.print("Informe um número: ");
		numero1 = scanner.nextInt();
		System.out.print("Informe outro número: ");
		numero2 = scanner.nextInt();
		int soma1 = numero1 + numero2;
		System.out.println("O resultado é: " + soma1);
		

//Peça o ano de nascimento do usuário e mostre quantos anos ele tem

		int idade25;
		int resu;
		int ano = 2025;
		System.out.println("Em que ano você nasceu?: ");
		idade25 = scanner.nextInt();
		resu = ano - idade25;
		System.out.println("Você tem " + resu + " anos");
		
//Calcular desconto
		
		double preco;
		double desconto;
		System.out.println("Qual o valor da compra? ");
		preco = scanner.nextDouble();
		System.out.println("Qual o valor do desconto? ");
		desconto = scanner.nextDouble();
		double pagar = preco - desconto;
		System.out.println("Pague: " + pagar);
		

//Peça duas notas decimais para o usuário, calcule média e mostre 
		
		double n1;
		double n2;
		System.out.println("Digite a sua primeira nota: ");
		n1 = scanner.nextDouble();
		System.out.println("Digite a sua segunda nota: ");
		n2 = scanner.nextDouble();
		double pay = (n1 + n2) / 2;
		System.out.println("Sua média final é de: " + pay);
		
		
		
		
		
	
	}


	
}
