import java.util.Scanner;

	/*RR - Roud Robin*/

public class Rr {

	static Scanner input = new Scanner(System.in);

	/*Recebe o nome e tempo dos processos*/
	static void recebeProcessos( int valoresProcessos[] , String nomesProcessos[] ) {
                for ( int i = 0; i < valoresProcessos.length; i++ ) {
			System.out.print("Digite o nome do processo: ");
			nomesProcessos[i] = input.next();
			System.out.print("Digite seu tempo: ");
                        valoresProcessos[i] = input.nextInt();
                }
	}

	/*Compara os valores a 0*/
	static boolean compara( int valoresProcessos[] ) {
		int contador = 0;
		for ( int i = 0; i < valoresProcessos.length; i++ ) {
			if ( valoresProcessos[i] <= 0 ) {
				contador++;
			}
		}
		if ( contador == valoresProcessos.length ) {
			return true;
		}
		else {
			return false;
		}
	}

		static void rr () {

		/*Declarando e recebendo os valores*/
		int quantum, n, contador,i;
		System.out.print("Digite o número de processos: ");
		n = input.nextInt();

		int valoresProcessos[] = new int[n];
		String nomesProcessos[] = new String[n];
		recebeProcessos( valoresProcessos, nomesProcessos );

		System.out.print("Digite o valor do quantum: ");
		quantum = input.nextInt();

		/*Execução*/
		i = 0;
		contador = 0;

		do {

			if ( valoresProcessos[i] <= 0 ) {
				for ( int j = 0; j < valoresProcessos.length; j++ ) {
					if ( valoresProcessos[j] > 0 ) {
						i = j;
						j = valoresProcessos.length;
					}
				}
			}

			System.out.println( nomesProcessos[i] + " em execução. ");

			try { Thread.sleep(quantum * 1000); } catch( Exception erro ) {}

			valoresProcessos[i] -= quantum;

			if ( valoresProcessos[i] <= 0 ) {
				System.out.println( nomesProcessos[i] + " finalizado." );
			}

			i++;

			if ( i == valoresProcessos.length ) {
				i = 0;
			}
 			if ( compara( valoresProcessos ) ) {
                        	break;
			}

		} while ( true );

	}
}
