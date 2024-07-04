package bytebankHerdado;

//Gerente é um FuncionarioAutenticavel ou Gerente herda da classe FuncionarioAutenticavel
public class Gerente extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do GERENTE");
		return super.getSalario();
		
		/*return super.getBonificacao() + super.getSalario();
		 
		-super->irá indicar que o atributo vem da classe mãe
		 
		 -utilizar os metodos(super.getSalario()) para não ter para deixar o 
		 tributo 'salario' como protected*/
	}	
}