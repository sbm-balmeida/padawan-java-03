package bytebankHerdadoConta;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override/*anotação que verifica se o método esta sendo reescrito está igual com
	o outro. Se estiver diferente, da erro de compilação.*/
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
}
