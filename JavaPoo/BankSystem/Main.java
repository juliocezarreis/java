public class Main {

	public static void main ( String[] args ) {

		/*Instanciando objetos do tipo Conta
		conta1, conta2 e conta3 são referências para o objeto Conta*/
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		Conta conta3 = conta2;

		/*Mudando o valor do atributo saldo para cada instância/referência*/
		conta1.saldo = 200;
		conta2.saldo = 300;
		conta3.saldo += 1000;

		/*Imprimindo o número das referências*/
		System.out.println( conta1 );
		System.out.println( conta2 );
		System.out.println( conta3 );

		/*Imprimindo o valor do atributo saldo de cada instância/referência*/
		System.out.println(conta1.saldo);
		System.out.println(conta2.saldo);
		System.out.println(conta3.saldo);

	}
}
