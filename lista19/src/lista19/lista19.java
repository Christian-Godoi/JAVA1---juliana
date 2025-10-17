package lista19;

public class lista19 {

	public static void main(String[] args) {

    // -------------------- 1 --------------------
    public static void classificarValor(int numero) {
        if (numero > 0) {
            System.out.println(numero + " é positivo");
        } else if (numero < 0) {
            System.out.println(numero + " é negativo");
        } else {
            System.out.println(numero + " é zero");
        }
    }

    // -------------------- 2 --------------------
    public static void verificarMaioridade(int idade) {
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }

    // -------------------- 3 --------------------
    public static void boasVindas(String nome) {
        System.out.println("Bem-vindo(a), " + nome + "!");
    }

    // -------------------- 4 --------------------
    public static void tabuada(int numero) {
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    // -------------------- 5 --------------------
    public static void juntarPalavras(String palavra1, String palavra2) {
        System.out.println(palavra1 + " " + palavra2);
    }

    // -------------------- 6 --------------------
    public static void parOuImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é ímpar");
        }
    }

    // -------------------- 7 --------------------
    public static void classificarTemperatura(double temp) {
        if (temp < 15) {
            System.out.println(temp + "°C - Frio");
        } else if (temp <= 25) {
            System.out.println(temp + "°C - Agradável");
        } else {
            System.out.println(temp + "°C - Quente");
        }
    }

    // -------------------- 8 --------------------
    public static void saudacaoPorTurno(String turno) {
        switch (turno.toLowerCase()) {
            case "manhã":
                System.out.println("Bom dia!");
                break;
            case "tarde":
                System.out.println("Boa tarde!");
                break;
            case "noite":
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Turno inválido");
        }
    }

    // -------------------- 9 --------------------
    public static void calcularMedia(double n1, double n2, double n3) {
        double media = (n1 + n2 + n3) / 3;
        System.out.printf("Média: %.2f%n", media);
    }

    // -------------------- 10 --------------------
    public static void verificarAprovacao(double nota) {
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Em recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}