package herançaAtividade;

public class animalMain  {

	public static void main(String[] args) {
		
		Cachorro c = new Cachorro();
		
		c.setNome("showder");
		c.setIdade(10);
		c.setRaca("Salsicha");
		
		
		Gato g = new Gato();
		
		g.setNome("Zoiudo");
		g.setIdade(2);
		g.setCor("Laranja");
		
		
		
		c.mostrarInfo();
		c.abanarRabo();
		
		g.mostrarInfo();
		g.getCor();
		g.subirNoMuro();
		
		
		
	}
	}
		
	

