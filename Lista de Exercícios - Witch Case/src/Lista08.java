import java.util.Scanner;

public class Lista08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);


//1
System.out.println("Escreva um número de 1 a 7 que representa cada dia da semana");	
String dia = scanner.next();


switch(dia) {
case "1":
	System.out.println("Fim de semana");
	break;
case"2":
	System.out.println("Dia útil");
	break;	
case"3":
	System.out.println("Dia útil");
	break;	
case"4":
	System.out.println("Dia útil");
	break;	
case"5":
	System.out.println("Dia útil");
	break;	
case"6":
	System.out.println("Dia útil");
	break;	
case"7":
	System.out.println("Fim de semana");
	break;	
	default:
		System.out.println("Dia inválido");
}		


//2
System.out.println("Digite o código da sua bebida (1 = Café, 2 = Chá, 3 = Suco, 4 = Refrigerante):");
String bebida = scanner.next();

switch(bebida) {
case "1":
	System.out.println("O café custa R$5,00");
	break;
case"2":
	System.out.println("O chá custa R$3,50");
	break;	
case "3":
	System.out.println("O suco custa R$4,00");
	break;
case "4":
	System.out.println("O refrigerante custa R$4,50");
	break;
	default:
		System.out.println("Código inválido");
}


//3
System.out.println("Qual o código do seu veículo (1 = Carro, 2 = Moto, 3 = Caminhão)?");
String veiculo = scanner.next();

switch(veiculo) {
case "1":
	System.out.println("A categoria do carro é leve");
	break;
case"2":
	System.out.println("A moto é da categoria motocicleta");
	break;	
case "3":
	System.out.println("O caminhão é da categoria pesado");
	break;
	default:
		System.out.println("Veículo inválido");
}


//4
System.out.println("Qual o código do plano (1 = Básico, 2 = Intermediário, 3 = Premium)?");
String mes = scanner.next();

switch(mes) {
case "1":
	System.out.println("O plano básico possui acesso limitado");
	break;
case"2":
	System.out.println("O plano intermediário possui acesso padrão e suporte");
	break;	
case "3":
	System.out.println("O plano premium possui acesso total e suporte prioritário");
	break;
	default:
		System.out.println("Plano inválido");

}


//5
System.out.println("Digite um número de 1 a 12 que representam um mês do ano:");
String plano = scanner.next();

switch(plano) {
case "1" :
case "12":
case "2":
	System.out.println("Nesse mês, a estação é o verão");
	break;
case"3":
case"4":
case"5":
	System.out.println("Nesse mês, a estação é o outono");
	break;
case "6":
case"7":
case"8":
	System.out.println("Nesse mês, a estação é o inverno");
	break;
case "9":
case"10":
case"11":
	System.out.println("Nesse mês, a estação é a primaveira");
	break;
	default:
		System.out.println("Mês inválido");
}


//6
System.out.println("Qual o código do ingresso (1 = Inteira, 2 = Meia-entrada, 3 = VIP)?");
String ingresso = scanner.next();

switch(ingresso) {
case "1":
	System.out.println("R$50,00");
	break;
case"2":
	System.out.println("R$25,00");
	break;	
case "3":
	System.out.println("R$100,00");
	break;
	default:
		System.out.println("Ingresso inválido");
}

//7
System.out.println("Qual o código do idioma? (1 = Português, 2 = Inglês, 3 = Espanhol)");
String idioma = scanner.next();

switch(idioma) {
	case "1":
		System.out.println("Olá");
		break;
	case"2":
		System.out.println("Hello");
		break;	
	case "3":
		System.out.println("Hola!");
		break;
		default:
			System.out.println("Idioma inválido");
}


//8
System.out.println("Qual o código do nível? (1 = Usuário, 2 = Moderador, 3 = Administrador)");
String nivel = scanner.next();

switch(nivel) {
case "1":
	System.out.println("Acesso básico");
	break;
case"2":
	System.out.println("Acesso básico + edição");
	break;	
case "3":
	System.out.println("Acesso total");
	break;
	default:
		System.out.println("Nível inválido");
}

//9

System.out.println("Qual o código de pagamento? (1 = Dinheiro, 2 = Cartão de Crédito, 3 = Pix)");
String pagamento = scanner.next();

switch(pagamento) {
case "1":
	System.out.println("Pagamento em dinheiro confirmado");
	break;
case"2":
	System.out.println("Pagamento com cartão processado");
	break;	
case "3":
	System.out.println("Pagamento via Pix realizado");
	break;
	default:
		System.out.println("Método inválido");
}
	
	
	
	
	}
	

}
