package bytebankHerdado;

//Gerente é um Funcionário ou Gerente herda da classe Funcionário
public class Gerente extends Funcionario {

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario(); 
		/*-super->irá indicar que o atributo vem da classe mãe
		 
		 -utilizar os metodos(super.getSalario()) para não ter para deixar o 
		 tributo 'salario' como protected*/
	}	
}