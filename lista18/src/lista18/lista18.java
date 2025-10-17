package lista18;

public class lista18 {

	public static void main(String[] args) {
		// -------------------- 1 --------------------
	    public static void apresentacao() {
	        System.out.println("1 – Apresentação");
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Meu nome é Christian!");
	        }
	        System.out.println();
	    }

	    // -------------------- 2 --------------------
	    public static void exibindoFrase() {
	        System.out.println("2 – Exibindo uma frase");
	        System.out.println("Acredite no seu potencial e vá além dos seus limites!");
	        System.out.println();
	    }

	    // -------------------- 3 --------------------
	    public static void imprimindoValores() {
	        System.out.println("3 – Imprimindo valores de 1 a 10");
	        for (int i = 1; i <= 10; i++) {
	            System.out.print(i + " ");
	        }
	        System.out.println("\n");
	    }

	    // -------------------- 4 --------------------
	    public static void mostrandoVogais() {
	        System.out.println("4 – Mostrando as vogais");
	        char[] vogais = {'A', 'E', 'I', 'O', 'U'};
	        for (char v : vogais) {
	            System.out.print(v + " ");
	        }
	        System.out.println("\n");
	    }

	    // -------------------- 5 --------------------
	    public static void desenhandoQuadrado() {
	        System.out.println("5 – Desenhando um quadrado");
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }

	    // -------------------- 6 --------------------
	    public static void imprimindoPares() {
	        System.out.println("6 – Imprimindo números pares de 2 a 20");
	        for (int i = 2; i <= 20; i += 2) {
	            System.out.print(i + " ");
	        }
	        System.out.println("\n");
	    }

	    // -------------------- 7 --------------------
	    public static void contagemRegressiva() {
	        System.out.println("7 – Contagem regressiva");
	        for (int i = 10; i >= 1; i--) {
	            System.out.print(i + " ");
	        }
	        System.out.println("Fim!\n");
	    }

	    // -------------------- 8 --------------------
	    public static void desenhandoTriangulo() {
	        System.out.println("8 – Desenhando um triângulo");
	        for (int i = 1; i <= 5; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }

	    // -------------------- 9 --------------------
	    public static void mostrandoDiasSemana() {
	        System.out.println("9 – Mostrando os dias da semana");
	        String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
	        for (String dia : dias) {
	            System.out.println(dia);
	        }
	       
	    }
	}