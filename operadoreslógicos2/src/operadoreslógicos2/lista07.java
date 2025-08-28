package operadoreslógicos2;

import java.util.Scanner;


public class lista07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

	
//1
	System.out.println("Qual a sua idade?");
	int idade = scanner.nextInt();
	if(idade < 16 || idade >70) {
		System.out.println("Classificação especial");
	} else {
		System.out.println("Classificação regular ");
	}

//2
	System.out.println("Qual o valor do produto?");
	int valor = scanner.nextInt();
	System.out.println("E quantidade comprada? ");
	int qnt = scanner.nextInt();
	if(valor > 200 && qnt > 5) {
		int total = valor * qnt;
		double desconto = total * 0.15;
		double valorFinal = total - desconto;
		System.out.println("O preço com desconto é de: " + valorFinal + " reais");
	} else {
		System.out.println("Não tem desconto");
	}
		
		
//3
   System.out.println("Qual a frequência cardíaca (em bpm)?");
   int freq = scanner.nextInt();
   System.out.println("Você sente tontura (sim ou não)? ");
   String tont = scanner.next();
   if (freq >= 100 || tont.equalsIgnoreCase("Sim")) {
	   System.out.println("Procure atendimento médico");
   } else {
	   System.out.println("Sem sinais de alerta");
   }
   
//4
   System.out.println("Qual a sua idade? ");
   int id2 = scanner.nextInt();
   System.out.println("Você é residente do estado (sim ou não)? ");
   String est = scanner.next();
   if (id2 >= 18 && id2 <= 30 && est.equalsIgnoreCase("sim") ) {
	   System.out.println("Elegível para o concurso");
   } else {
	   System.out.println("Não elegível para o concurso");
   }
   
//5
   System.out.println("Qual o número de projetos concluídos? ");
   int proj = scanner.nextInt();
   System.out.println("Qual o número de erros reportados? ");
   int erro = scanner.nextInt();
   if(proj > 10 && erro <3) {
	   System.out.println("Recompensa concedida");
   } else {
	  System.out.println("Sem recompensa");
   }
		
//6
   System.out.println("Qual a sua idade? ");
   int id3 = scanner.nextInt();
   System.out.println("Você possui passaporte válido (sim ou não)? ");
   String pass = scanner.next();
   if (id3 >= 18 && pass.equalsIgnoreCase("Sim")) {
	   System.out.println("Viagem autorizada");
   } else {
	   System.out.println("Viagem não autorizada");
   }
		
//7
   System.out.println("Qual a sua nota final (0 a 100)? ");
   int nota = scanner.nextInt();
   System.out.println("Qual o número de aulas assistidas (0 a 50)? ");
   int num = scanner.nextInt();
   if (nota >= 70 && num >= 40) {
	   System.out.println("Aprovado");
   } else {
	   System.out.println("Reprovado");
   }
   

//8
   System.out.println("Qual a umidade do solo?");
   int umi = scanner.nextInt();
   System.out.println("E qual a temperatura?");
   int temp1 = scanner.nextInt();
   if (umi < 30 || temp1 > 30) {
	   System.out.println("Irrigação necessária");
   } else {
	   System.out.println("Irrigação não necessária");
   }
   
//9
	int id5;
	System.out.println("Qual a sua idade? ");
	id5 = scanner.nextInt();
	System.out.println("Tem experiência? ");
	String resp = scanner.next();
    if (id5 >= 20 && id5 <= 40 && resp.equalsIgnoreCase("sim")) {
    	System.out.println("Inscrição aceita");
    } else {
    	System.out.println("Inscrição não permitida");
    }
	
	
   
		
	}

}
