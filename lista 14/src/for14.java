import java.util.Scanner;

public class for14 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//1
		for (int cont = 1; cont <= 10; cont++) {
			System.out.println(cont);
		}
		System.out.println("----------------------------");
		
//2
		int soma = 0;
		for (int i = 1; i <= 100; i++) {
			soma += i;
		}
		System.out.println("A soma dos números de 1 a 100 é: " + soma);
		System.out.println("----------------------------");
		
//3
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("----------------------------");
		
//4
		System.out.println("Digite um número qualquer: ");
		int numero = scanner.nextInt();
		System.out.println("Tabuada do " + numero + ":");
		for (int i = 1; i <= 10; i++) {
		System.out.println(numero + " x " + i + " = " + (numero * i));
			}
		System.out.println("----------------------------");
		
//5
		int contador = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
		contador++;
		System.out.println("Existem " + contador + " números divisíveis por 3 entre 1 e 50.");
		}
			}
		System.out.println("----------------------------");
		
//6
	System.out.println("Digite um número aleatório: ");
	int num = scanner.nextInt();
	int contador3 = 0;
	for (int i = 1; i <= num; i++) {
		if (i % 3 == 0) {
	contador3++;
	System.out.println("Existem " + contador3 + " números ímpares");
	}
		}
	System.out.println("----------------------------");
		
//7
	int resultado = 1; 

    for (int i = 1; i <= 5; i++) {
        System.out.print("Digite o valor " + i + ": ");
        int valor = scanner.nextInt();
        resultado *= valor; 
    }

    System.out.println("O resultado da multiplicação dos 5 valores é: " + resultado);
    scanner.close();


//8
    for (int i = 1; i <= 10; i++) {
        System.out.print("Digite os anos de empresa do funcionário " + i + ": ");
        int anos = scanner.nextInt();

        if (anos > 10) {
            System.out.println("Parabéns! Você irá receber um prêmio");
        } else {
            System.out.println("Quase lá");
        }
    }
		
		
		
		
		
		
		
		
	}
}
