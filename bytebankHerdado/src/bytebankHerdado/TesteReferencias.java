package bytebankHerdado;

public class TesteReferencias {

	public static void main(String[] args) {
							//Objeto do tipo Gerente, mais específico
		Funcionario g1 = new Gerente();
		/* Referencia do tipo Funcionario, mais generico(so é possível chamar
		metodos definidos dentro da classe Funcionario */
		
		g1.setNome("Marcos");
		
		String nome = g1.getNome();
		System.out.println(nome);
	}

}
