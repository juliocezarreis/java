import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main ( String[] args ) {
		
			Conta conta1 = new Conta();
			conta1.titular = "Paula Tejando";
			conta1.agencia = 2222;
			conta1.numero = 2222222;
			conta1.saldo = 0;
			
			conta1.deposita(input.nextDouble());
			conta1.saca(input.nextDouble());
			
			System.out.println(conta1.saldo);
		}
	}
