package herançaAtividade;

public class Gerente extends Funcionario {
private String departamento;

public String getDepartamento() {
	return departamento;
}

public void setDepartamento(String departamento) {
	this.departamento = departamento;
}


public double calcularSalario() {
	return getSalarioBase() * 1.20;
}

public void gerenciar() {
	System.out.println("O gerente do departamento " +departamento+ " está gerenciando a equipe.");
}
}
