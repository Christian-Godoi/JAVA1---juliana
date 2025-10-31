package EncapsulamentoAtividade;

public class alunoP {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
        a1.setNome("Carlos");
        a1.setIdade(18);

        System.out.println("Nome: " + a1.getNome());
        System.out.println("Idade: " + a1.getIdade());
    }
	

}

