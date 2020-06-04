public class Main {

	public static void main ( String[] args ) {

		/*Instanciando objetos do tipo Conta*/
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();

		conta1.deposita(800);
		conta2.deposita(1000);

		Funcoes.saqueEfetuado( conta1.saca(900) );

		System.out.println("Saldo atual da conta1: " + conta1.saldo);
		System.out.println("Saldo atual da conta2: " + conta2.saldo);

		Funcoes.transferenciaEfetuada( conta2.transfere(1001, conta1) ); 

		System.out.println("Saldo da conta1: " + conta1.saldo);
		System.out.println("Saldo da conta2: " + conta2.saldo);
	}
}
