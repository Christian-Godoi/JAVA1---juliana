
public class Gato {
	String nome;
	int idade;
	int raca;
	
	
	void miar() {
		System.out.println("Miau!");
	}
	void comer() {
		System.out.println(nome + ",está comendo");
	}
	void mostrarInformações() {
		System.out.println("O nome do gato é "+nome + ", sua raça é " + raca + " e sua idade é " +idade);
	}
}
