package polimorfismoAtividade;

public class InstrumentoMain {

	public static void main(String[] args) {
		
		Instrumento p1 = new Violao();
		Instrumento p2 = new Bateria();
		Instrumento p3 = new Piano();
		
		p1.tocar();
		p2.tocar();
		p3.tocar();

	}

}
