import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//1
		String[] nomes = new String[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Fruta [" + i + "]: ");
			nomes[i] = scanner.next();
		}
		System.out.println("----------------------------");

//2
		String[] n1 = new String[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Número [" + i + "]: ");
			n1[i] = scanner.next();
		}
		System.out.println("----------------------------");

//3

		int[] n = new int[7];
		for (int i = 0; i < 7; i++) {
			System.out.println("Escreva sete números: ");
			n[i] = scanner.nextInt();
		}

		System.out.println("Mostrando os valores invertidos: ");
		for (int i = 6; i >= 0; i--) {
			System.out.println(n[i]);
		}
		System.out.println("----------------------------");
//4		
		 int[] numeros = new int[10];
	        int i = 0;

	        do {
	            System.out.print("Digite o número " + (i+1) + ": ");
	            numeros[i] = scanner.nextInt();

	            if(numeros[i] > 100) {
	                System.out.println(numeros[i] + " é maior do que 100");
	            }

	            i++;
	        } while(i < 10);
		System.out.println("----------------------------");

//5

		int[] numeros2 = new int[8];
		int i1 = 0;
		do {
			System.out.print("Digite o número " + (i1 + 1) + ": ");
			numeros2[i1] = scanner.nextInt();
			i1++;
		} while (i1 < 8);

		System.out.print("Digite um número para procurar: ");
		int procurar = scanner.nextInt();

		boolean encontrado = false;
		i = 0;
		do {
			if (numeros[i] == procurar) {
				encontrado = true;
			}
			i++;
		} while (i < 8);

		if (encontrado) {
			System.out.println("O número existe no vetor!");
		} else {
			System.out.println("O número não existe no vetor!");
		}

		System.out.println("------------------------------------");

//6 
		String[] nomes1 = new String[5];
		int[] idades = new int[5];

		i = 0;
		do {
			System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
			nomes1[i] = scanner.next();
			System.out.print("Digite a idade de " + nomes1[i] + ": ");
			idades[i] = scanner.nextInt();
			i++;
		} while (i < 5);

		i = 0;
		do {
			System.out.println(nomes[i] + " tem " + idades[i] + " anos");
			i++;
		} while (i < 5);

		System.out.println("------------------------------------");

//7 
		int[] idadeVetor = new int[10];
		i = 0;
		do {
			System.out.print("Digite a idade " + (i + 1) + ": ");
			idadeVetor[i] = scanner.nextInt();
			i++;
		} while (i < 10);

		i = 0;
		do {
			if (idadeVetor[i] < 18) {
				System.out.println("Idade " + idadeVetor[i] + ": você é menor de idade");
			}
			i++;
		} while (i < 10);

		System.out.println("------------------------------------");
//8
		double[] salarios = new double[7];
		i = 0;
		do {
			System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
			salarios[i] = scanner.nextDouble();
			if (salarios[i] <= 2500) {
				System.out.println("Salário: " + salarios[i] + " -> você receberá um aumento");
			} else {
				System.out.println("Salário: " + salarios[i] + " -> sem aumento");
			}
			i++;
		} while (i < 7);

	}

}
