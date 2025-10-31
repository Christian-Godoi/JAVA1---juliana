package EncapsulamentoAtividade;

public class avaliacaoP {

	public static void main(String[] args) {
		
		 Avaliacao aluno = new Avaliacao("Mariana");
	        aluno.setNota1(9);
	        aluno.setNota2(8);

	        System.out.println("Aluno: " + aluno.getNome());
	        System.out.println("Média: " + aluno.calcularMedia());
	}

}
