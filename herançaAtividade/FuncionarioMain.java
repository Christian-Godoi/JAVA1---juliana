package herançaAtividade;

public class FuncionarioMain {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		
		g.setNome("Carlos");
		g.setSalarioBase(5000);
		g.setDepartamento("TI");
		
		Vendedor v = new Vendedor();
		v.setNome("João");
		v.setSalarioBase(2000);
		
		
		g.exibirInfo();
		g.gerenciar();
		
		v.exibirInfo();
		v.vender();
	}

}
