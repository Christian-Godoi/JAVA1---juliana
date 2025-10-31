package EncapsulamentoAtividade;

public class contabancariaP {

	public static void main(String[] args) {
		
		 ContaBancaria c1 = new ContaBancaria("João");

	        c1.depositar(500);
	        System.out.println("Saldo após depósito: " + c1.getSaldo());

	        c1.sacar(200);
	        System.out.println("Saldo após saque: " + c1.getSaldo());

	        c1.sacar(400);
	}
}
