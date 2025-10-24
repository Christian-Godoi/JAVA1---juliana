import java.util.Scanner;

public class musicaP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Musica musica1 = new Musica();
        musica1.titulo = "Bohemian Rhapsody";
        musica1.artista = "Queen";
        musica1.duracao = 5.55;

        
        Musica musica2 = new Musica();
        musica2.titulo = "Give it away";
        musica2.artista = "Red hot chilli peppers";
        musica2.duracao = 4.24;

       System.out.println("\n");
        Musica musica3 = new Musica();
        musica3.titulo = "Dias de luta, dias de glória";
        musica3.artista = "Charlie Brown JR.";
        musica3.duracao = 3.22;
        
        musica1.tocar();
        musica1.mostrarDetalhes();
        musica1.pausar();
        System.out.println("\n");
       
        musica2.tocar();
        musica2.mostrarDetalhes();
        musica2.pausar();

        System.out.println("\n");
        musica3.tocar();
        musica3.mostrarDetalhes();
        musica3.pausar();
	}

}
