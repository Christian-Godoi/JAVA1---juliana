package polimorfismoAtividade;

public class Violao extends Instrumento{

	@Override
	public void tocar() {
		System.out.println("Violão de qualidade.");
	}
}
