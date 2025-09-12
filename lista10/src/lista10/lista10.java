package lista10;

import java.util.Scanner;

public class lista10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
	//1	
		int contador = 10;
		while (contador <= 30) {
			System.out.println(contador);
			contador++;		
		}
		
		System.out.println("----------------------------------------");
	//2
		int contador2 = 1;
		int soma = 0;
		
		while(contador2 <= 3) {
			System.out.println("Digite o número " + contador2 + ":");
			int numero = scanner.nextInt();
			soma = soma + numero;
			contador2++;
			System.out.println("A soma é: " + soma);
		}
		
		System.out.println("----------------------------------------");
		
	//3
		
		int contador3 = 1;
		int soma1 = 0;
		
		while(contador3 <= 5) {
			System.out.println("Digite o número " + contador3 + ":");
			int numero = scanner.nextInt();
			soma1 = soma1 + numero;
			contador3++;
			System.out.println("A soma é: " + soma1);
		}
		System.out.println("----------------------------------------");
		
	//4
		System.out.println("Informe um número: ");
		int n1 = scanner.nextInt();
		int contador4 = 1;
		while (contador4<= n1) {
			System.out.println(contador4);
			contador4++;	
		}
		System.out.println("----------------------------------------");
	
	//5
		int i = 1;       
	    int soma3 = 0;    

	     while (i <= 5) { 
	     soma3 = soma3 + i; 
	     i++;             
	        }
	     System.out.println("A soma dos números de 1 a 5 é: " + soma3);
	    
	     System.out.println("----------------------------------------");
	
	 //6
	    System.out.println("Digite um número qualquer: "); 
		int n2 = scanner.nextInt();
		int n = 1;
		while (n <= 10) {
			int resultado = n2 * n;
		System.out.println(n2 + " x " + n + " = " + resultado);
	n++;
	
		}
		
	}

	}
