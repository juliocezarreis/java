import javax.swing.JOptionPane;

public class Funcoes {

    public static void saqueEfetuado ( boolean saque) {
        if ( saque ) {
			JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
		}
	}
	
	public static void transferenciaEfetuada ( boolean transferencia ) {
		if ( transferencia ) {
			JOptionPane.showMessageDialog(null, "Transferência efetuada.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
		}
	}
}