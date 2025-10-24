
public class Musica {

	String titulo;
	String artista;
	double duracao;
	
	
	void tocar() {
		System.out.println("Tocando " + titulo + " de " + artista);
	}
	void pausar() {
		System.out.println("Música pausada");
	}
	void mostrarDetalhes() {
		System.out.println("A música dura em torno de " + duracao + " minutos, seu título é " + titulo + "e o artista é " + artista);
	}
}
