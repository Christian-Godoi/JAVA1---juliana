import java.util.Scanner;

public class operadoreslógicos {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
//1	
System.out.println("Escreva um número ");
int idade = scanner.nextInt();
if(idade >10 && idade<20) {
System.out.println("Número dentro do intervalo");
} else {
System.out.println("Fora do intervalo \n");
}
	

//2
System.out.println("Qual a sua idade? ");
int id = scanner.nextInt();
System.out.println("Você tem convite? (true/false): ");
boolean ingresso = scanner.nextBoolean();
if(id >= 18 && ingresso) {
	System.out.println("Entrada Permitida");
} else {
	System.out.println("Entrada Negada \n");
}


//3
System.out.println("Qual a sua idade? ");
int gig = scanner.nextInt();
if(gig <12 && gig>60) {
System.out.println("Categoria Especial");
} else {
System.out.println("Categoria normal \n");
}
	

//4
System.out.println("Qual o valor do produto?");
int preco = scanner.nextInt();
System.out.println("Qual a forma de pagamento? (avista ou cartão)");
String forma = scanner.next();
if (preco >= 100 && forma.equalsIgnoreCase("avista")){
	System.out.println("Você tem 10% de desconto!");
} else {
	System.out.println("O valor é " + preco + "reais \n");
	
}


//5
System.out.println("Qual a sua temperatura? ");
int temp = scanner.nextInt();
System.out.println("Você possui sintomas? ");
String sint = scanner.next();
if (temp > 38 || sint.equalsIgnoreCase("Sim")) {
	System.out.println("Recomenda-se procurar um médico.");
} else {
	System.out.println("Sem sinais preocupantes \n ");
}
	

//6
System.out.println("Qual a sua idade?");
int id2 = scanner.nextInt();
System.out.println("Você é brasileiro?");
String ss = scanner.next();
if (id2 >= 16 || ss.equalsIgnoreCase("Sim")) {
	System.out.println("Você pode votar!");
} else {
	System.out.println("Você não pode votar \n");
}
		
		
//7
System.out.println("Qual a sua quantidade de horas extras? ");
int horas = scanner.nextInt();
System.out.println("Qual o número de faltas? ");
int faltas = scanner.nextInt();
if (horas > 20 && faltas<5) {
System.out.println("Você ganhou um bônus!");
} else {
	System.out.println("Você não ganhou o bônus \n");
}
		

//8
System.out.println("Qual a sua idade?");
int qq = scanner.nextInt();
System.out.println("Você possui carteira de motorista? ");
String nn = scanner.next();
if (qq >= 18 && nn.equalsIgnoreCase("Sim")) {
	System.out.println("Você pode dirigir");
} else {
	System.out.println("Você não pode dirigir \n");
}
		

//9
System.out.println("Qual a sua nota? (0 a 10)");
double nota = scanner.nextDouble();
System.out.println("Qual sua frequência (0 a 100)");
int frequencia=scanner.nextInt();

if(nota >= 8 || frequencia >= 80) {
	System.out.println("Bolsa concedida");
} else {
	System.out.println("Bolsa não concedida");
}

//10
System.out.println("Qual a temperatura em graus? ");
int calor = scanner.nextInt();
System.out.println("E a umidade? (%)");
int umi = scanner.nextInt();
if (calor < 18 || calor > 26 && umi >= 60) {
	System.out.println("Ajustar climatização");
}else {
	System.out.println("Climatização não necessária");
}



		
		
		
	}

}
