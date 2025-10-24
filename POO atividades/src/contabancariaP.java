import java.util.Scanner;

public class contabancariaP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Christian Godoi";
        conta.saldo = 0.0;

      
        conta.mostrarSaldo();

        
        conta.depositar(1000.00);

       
        conta.sacar(300.00);

       
        conta.sacar(800.00);

       
        conta.mostrarSaldo();
    }

	}


