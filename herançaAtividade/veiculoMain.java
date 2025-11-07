package herançaAtividade;

public class veiculoMain {

	public static void main(String[] args) {
		Carro c = new Carro();
		
		c.setMarca("Renault");
		c.setAno(2022);
		c.setPortas(4);

		c.exibirInfo();
		c.abrirPortaMalas();
	}

}
