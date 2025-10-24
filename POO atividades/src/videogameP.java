import java.util.Scanner;

public class videogameP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		VideoGame console = new VideoGame();
		
		console.ligar();
		console.verificarStatus();
		console.desligar();
		console.verificarStatus();

		System.out.println("Como está o console?");
		console.ligado= scanner.nextBoolean();
		console.verificarStatus();

	}

}
