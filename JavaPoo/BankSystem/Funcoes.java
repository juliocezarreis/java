public class Funcoes {

    public static void saqueEfetuado ( boolean saque) {
        if ( saque ) {
			System.out.println("Saque efetuado com sucesso.");
		}
		else {
			System.out.println("Saldo insuficiente.");
		}
	}
	
	public static void transferenciaEfetuada ( boolean transferencia ) {
		if ( transferencia ) {
			System.out.println("Transferência efetuada.");
		}
		else {
			System.out.println("Saldo insuficiente.");
		}
	}
}