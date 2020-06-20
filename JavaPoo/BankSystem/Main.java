public class Main {

	public static void main ( String[] args ) {

		/*"Brincadeiras" com [Orientacao a Objeto] apenas por treinamento*/

		Conta conta1 = new Conta();
		Conta conta2 = new Conta();

		conta1.deposita(800);
		conta2.deposita(1000);

		Funcoes.saqueEfetuado( conta1.saca(700) );

		System.out.println("Saldo atual da conta1: " + conta1.getSaldo());
		System.out.println("Saldo atual da conta2: " + conta2.getSaldo());

		Funcoes.transferenciaEfetuada( conta2.transfere(101, conta1) ); 

		System.out.println("Saldo da conta1: " + conta1.getSaldo());
		System.out.println("Saldo da conta2: " + conta2.getSaldo());

		//Conta do Paulo
		Conta conta3 = new Conta();
		Cliente paulo = new Cliente();
		conta3.setTitular(paulo);

		paulo.setNome("Paulo");
		System.out.println("Cliente: " + conta3.getTitular().getNome());

		conta3.setNumero(7280);
		System.out.println("N: " + conta3.getNumero());
		conta3.setAgencia(7809);
		System.out.println("Ag: " + conta1.getAgencia());
		paulo.setCpf("222.222.222-22");
		System.out.println(paulo.getCpf());
	}
}