import java.util.Scanner;



public class Lista02 {

	public static void main(String[] args) {


	

	Scanner scanner = new Scanner(System.in);

// 1 - Resultado de dois números
	
	int num1;
	int num2;
	System.out.println("Informe um número: ");
	num1 = scanner.nextInt();
	System.out.println("Informe outro número: ");
	num2 = scanner.nextInt();
	double soma = num1 + num2;
	double sub = num1 - num2;
	double div = num1 / num2 ;
	double mult = num1 * num2;
	double resto = num1 % num2;
	System.out.println("O valor da soma é: " + soma);
	System.out.println("O valor da subtração é: " + sub);
	System.out.println("O valor da multiplicação é: " + mult);
	System.out.println("O valor da divisão é: " + div);
	System.out.println("O valor do resto é: " + resto);
	

// 2- Cálculo de temperatura
	
	int temp;
	System.out.println("Informe uma temperatura em graus Celsius: ");
	temp = scanner.nextInt();
	double F = (temp * 1.8) + 32;
	System.out.println("Sua temperatura convertida em fahrenheit é: " + F);
	

// 3 - Conversão de valor 
	
	int conv;
	System.out.println("Digite aqui um valor em reais para que eu faça a conversão para o dólar: ");
	conv = scanner.nextInt();
	double dlar = conv/5.70;
	System.out.println("O valor em dolares fica: $" + dlar);
	

// 4 - Área do retângulo 
	

	int bas;
	int alt;
	System.out.println("Fale o valor da base de um retângulo para que eu possa mostrar a área total: ");
	bas = scanner.nextInt();
	System.out.println("Agora digite o valor da altura: ");
	alt = scanner.nextInt();
	double multi = bas * alt;
	System.out.println("A área deste retângulo é: " + multi);
	
	
// 5 - Conversor de idade 
	
	int idade;
	System.out.println("Qual a sua idade? ");
	idade = scanner.nextInt();
	double mese = idade*12;
	System.out.println("Você já viveu: " + mese + " meses");
	

// 6 - Conversor de minutos para segundos
	

	int mint;
	System.out.println("Informe o(s) minuto(s) que deseja para que eu os converta para segundo(s)");
	mint = scanner.nextInt();
	double burro = mint*60;
	System.out.println("O(s) minuto(s) digitado(s) são: " + burro + " segundos");

	
// 7 - Custo da compra 
	
	int prod;
	int qnt;
	System.out.println("Informe o preço do produto que deseja: ");
	prod = scanner.nextInt();
	System.out.println("Agora informe a quantidade que deseja: ");
	qnt = scanner.nextInt();
	double tot = prod*qnt;
	System.out.println("O valor a ser pago em reais é de: " + tot + " reais");
	
	
// 8 - Divisão de uma conta de restaurante 
	

int valorr;
int pessoas;
System.out.println("Qual foi o valor da conta? ");
valorr = scanner.nextInt();
System.out.println("E qual a quantidade de pessoas? ");
pessoas = scanner.nextInt();
double res = valorr/pessoas;
System.out.println("Cada pessoa deve pagar R$ " + res);


// 9 - Cálculo de troco 

int compra;
int pago;
System.out.println("Qual foi o valor da compra? ");
compra = scanner.nextInt();
System.out.println("Quanto você deu ao caixa? ");
pago = scanner.nextInt();
double subs = pago - compra;
System.out.println("O troco é de: " + subs + " reais");


	
	
	
	
	
	}

	
	
	
	
}
