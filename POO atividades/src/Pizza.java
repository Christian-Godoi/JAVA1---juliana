
public class Pizza {

	String sabor;
	String tamanho;
	Boolean bordaRecheada = true;

	void preparar() {
		System.out.println("Preparando a pizza de sabor " + sabor);
	}
	void assando() {
		System.out.println("Assando pizza tamanho" + tamanho);
	}
	void mostrarInformacoes() {
		System.out.println("A pizza de " +sabor +", e do tamanho " +tamanho+ " e com borda "+bordaRecheada+" está pronta ");
	}
}
