package bytebankHerdado;

public class TesteReferencias {

	public static void main(String[] args) {
							//Objeto do tipo Gerente, mais específico
		Funcionario g2 = new Gerente();
		/* Referencia do tipo Funcionario, mais generico(so é possível chamar
		metodos definidos dentro da classe Funcionario */
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		EditorVideo ev1 = new EditorVideo();
		ev1.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setSalario(2500.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev1);
		controle.registra(d);

		System.out.println(controle.getSoma());
	}

}
