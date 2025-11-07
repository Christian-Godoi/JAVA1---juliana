package herançaAtividade;

public class Funcionario {
	private String nome;
private double salarioBase;

public void setNome(String nome) {
	this.nome = nome;
}

public String getNome() {
	return nome;
}

public double getSalarioBase() {
	return salarioBase;
}

public void setSalarioBase(double salariBase) {
	this.salarioBase = salariBase;
}

public double calcularSalario() {
	return salarioBase;
}

public void exibirInfo() {
	System.out.println("Nome: " +nome+ " | Salário: R$ " +calcularSalario());
}

}
