package bytebankHerdado;

//Gerente é um Funcionário ou Gerente herda da classe Funcionário
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do DESIGNER");
		return 200; 
	}	
}