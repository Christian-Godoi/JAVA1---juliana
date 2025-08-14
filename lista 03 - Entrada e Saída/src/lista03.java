import java.util.Scanner;

public class lista03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
//1
	
	int num1;
	int num2;
	System.out.println("Informe um número: ");
	num1 = scanner.nextInt();
	System.out.println("Informe outro número: ");
	num2 = scanner.nextInt();
	double result = num1 + num2;
	System.out.println("A soma dos números é: " + result);
	
	
//2
	
	int num3;
	int num4;
	System.out.println("Informe um número: ");
	num3 = scanner.nextInt();
	System.out.println("Informe outro número: ");
	num4 = scanner.nextInt();
	double div = num3/num4;
	double resto = num3%num4;
	System.out.println("O resultado da divisão é: " + div + " e o resto é de " + resto);
		
		
//3
	
	double num5;
	double num6;
	double num7;
	System.out.println("Informe um número: ");
	num5 = scanner.nextInt();
	System.out.println("Informe outro número: ");
	num6 = scanner.nextInt();
	System.out.println("Informe um número: ");
	num7 = scanner.nextInt();
	double form = num5 + num6 + num7;
	System.out.println("O perímetro é: " + form);
	

//4
	
	int valorr;
	int pessoas;
	System.out.println("Qual foi o valor da conta? ");
	valorr = scanner.nextInt();
	System.out.println("E qual a porcentagem de gorjeta desejada? ");
	pessoas = scanner.nextInt();
	double res = valorr*pessoas/100;
	double tot = valorr + res;
	System.out.println("O valor da gorjeta é de: " + res + ", então o total é de: " + tot);
	

//5
	
	int calcu;
	System.out.println("Digite o raio de um círculo (em metros): ");
	calcu = scanner.nextInt();
	double área = 3.14159 * calcu * calcu;
	System.out.println("A área do círculo é: " + área);
	
	
//6
	
	int idade;
	System.out.println("Qual a sua idade? ");
	idade = scanner.nextInt();
	double meses = idade*12;
	double resultado = (idade*365) + (meses*30);
	System.out.println("Você viveu " + resultado + " dias");
	

//7
	
	int horas;
	int pago;
	System.out.println("Quantas horas trabalhadas vc possui? ");
	horas = scanner.nextInt();
	System.out.println("E qual o valor pago por hora?");
	pago = scanner.nextInt();
	double bruto = horas*pago;
	double imposto = bruto * 0.10;
	double liquido = bruto - imposto;
	System.out.println("O seu salário bruto é de: " + bruto + " reais, os impostos retiram: " + imposto + "reias do total, e o líquido é de: " + liquido);
	
		
		
		
		
		
		
		
		
		
	}
	
}
