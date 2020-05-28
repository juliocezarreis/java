import java.util.*;
import javax.swing.JOptionPane;

/*Chamada das funções*/

public class Escalonamento {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		do {

			String escolha = JOptionPane.showInputDialog(null,"Escalonamento de processos\n1 - FIFO\n2 - SJF\n3 - RR\n0 - Sair");

			if ( escolha.equals("0") ) {
				break;
			}
			else if ( escolha.equals("1") ) {
				Fifo.fifo();
			}
			else if ( escolha.equals("2") ) {
				Sjf.sjf();
			}
			else {
				JOptionPane.showMessageDialog(null,"Programa em falta! :(");
			}

		} while ( true );
	}
}
