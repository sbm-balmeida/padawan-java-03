package bytebankHerdado;

//nao pode instanciar dessa classe, pq é abstrato
public abstract class Funcionario {

	private String nome;
	private String cpf;
//	protected double salario;/*protected(entre o public e o private)-> publico para
//	os meus filhos*/
	private double salario;
	
	//método abstract-> metodo sem corpo, não há implementação
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}