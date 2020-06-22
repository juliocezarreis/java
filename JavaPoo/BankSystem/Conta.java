import javax.swing.JOptionPane;

public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalContas;

	public Conta ( int numero, int agencia ) {
		Conta.totalContas++;
		setNumero(numero);
		setAgencia(agencia);
		JOptionPane.showMessageDialog(null, "Conta criada com sucesso!\nNumero: " + this.numero + "\nAgencia: " + this.agencia);
	}

	public void deposita ( double valor ) {
		this.saldo += valor;
	}

	public boolean saca ( double valor ) {
		if ( this.saldo >= valor ) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transfere ( double valor, Conta conta1) {
		if ( this.saldo >= valor ) {
			this.saldo -= valor;
			conta1.deposita(valor);
			return true;
		}
		return false;
	} 

	public double getSaldo () {
		return this.saldo;
	}

	public int getNumero () {
		return this.numero;
	}

	public void setNumero ( int numero ) {
		if ( numero <= 0 ) {
			JOptionPane.showMessageDialog(null, "Negativo!");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia () {
		return this.agencia;
	}

	public void setAgencia ( int agencia ) {
		if ( agencia <= 0 ) {
			JOptionPane.showMessageDialog(null, "Negativo!");
			return;
		}
		this.agencia = agencia;
	}

	public Cliente getTitular () {
		return this.titular;
	}

	public void setTitular ( Cliente titular ) {
		this.titular = titular;
	}

	public static int getTotalContas () {
		return Conta.totalContas;
	}
	
}