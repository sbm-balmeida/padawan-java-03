package bytebankHerdado;

//Gerente é um Funcionário ou Gerente herda da classe Funcionário
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do EDITOR");
		return super.getBonificacao() + 100; 
	}	
}