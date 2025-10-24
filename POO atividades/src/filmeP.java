import java.util.Scanner;

public class filmeP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Filme filme1 = new Filme();
		filme1.titulo = "A origem";
		filme1.duracao = 2.28;
		filme1.genero = "Ficção científica, Ação, Suspense";

		Filme filme2 = new Filme();
		filme2.titulo ="Orgulho e Preconceito";
		filme2.duracao = 2.07;
		filme2.genero = "Romance, Drama";
		
		Filme filme3 = new Filme();
		filme3.titulo = "Pantera Negra";
		filme3.duracao = 2.14;
		filme3.genero = "Ação, aventura, ficção científica";
		
		 System.out.println("\n");
		    filme1.mostrarInformacoes();
		    filme2.mostrarInformacoes();
		    filme3.mostrarInformacoes();
	}

}
