
public class Filme {

	String titulo;
	String genero;
	double duracao;
	
	void assistir() {
		System.out.println("Assistindo " + titulo);
	}
	
	void mostrarInformacoes() {
		 System.out.println("Filme " + titulo);
	        System.out.println("Gênero do filme: " + genero);
	        System.out.println("Duração do filme: " + duracao);
	        System.out.println("-------------------------");
	}
}
