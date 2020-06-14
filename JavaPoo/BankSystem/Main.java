public class Main {

	public static void main ( String[] args ) {

		Conta conta1 = new Conta();
		Conta conta2 = new Conta();

		conta1.deposita(800);
		conta2.deposita(1000);

		Funcoes.saqueEfetuado( conta1.saca(700) );

		System.out.println("Saldo atual da conta1: " + conta1.saldo);
		System.out.println("Saldo atual da conta2: " + conta2.saldo);

		Funcoes.transferenciaEfetuada( conta2.transfere(101, conta1) ); 

		System.out.println("Saldo da conta1: " + conta1.saldo);
		System.out.println("Saldo da conta2: " + conta2.saldo);

		Conta conta3 = new Conta();
		conta3.titular = new Cliente();
		conta3.titular.nome = "Júlio";

		System.out.println(conta3.titular.nome);
	}
}
