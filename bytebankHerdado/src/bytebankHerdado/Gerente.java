package bytebankHerdado;

/*Gerente é um Funcionario, Gerente herda da classe Funcionario, assina o contrato 
Autenticavel, é um Autenticavel*/
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do GERENTE");
		return super.getSalario();
		
		/*return super.getBonificacao() + super.getSalario();
		 
		-super->irá indicar que o atributo vem da classe mãe
		 
		 -utilizar os metodos(super.getSalario()) para não ter para deixar o 
		 tributo 'salario' como protected*/
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}