public class Conta {
	String titular;
	int numero;
	int agencia;
	double saldo;
	
	void saca ( double valor ) {
			this.saldo -= valor;
		}
	void deposita ( double valor ) {
			this.saldo += valor;
		}
	void transfere ( double valor,Conta transfere,Conta recebe )  {
		recebe.saldo += valor;
		transfere.saldo -= valor;
		}
}
