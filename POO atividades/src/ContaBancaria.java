
public class ContaBancaria {

	String titular;
	double saldo;
	

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

   
    void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else if (valor <= 0) {
            System.out.println("Valor de saque inválido!");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        }
    }

 
    void mostrarSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo atual: R$" + saldo);
        System.out.println("-------------------------");
    }
}
