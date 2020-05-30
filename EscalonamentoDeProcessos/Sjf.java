import java.util.Scanner;
import java.util.Arrays;

/*Sjf (fifo em ordem crescente)*/

public class Sjf {

	static void sjf () {
		Scanner input = new Scanner(System.in);

		int nprocessos, contador, executou, cont;

		System.out.println("Digite a quantidade de processos:");
		nprocessos = input.nextInt();
		int processos[] = new int[nprocessos];

		System.out.println("Digite o número do processo e depois (enter)");
		for ( int i = 0; i < processos.length; i++ ) {
			processos[i] = input.nextInt();
		}

		Arrays.sort(processos);

		contador = 0;
		executou = 0;
		cont = 1;
		do {

			System.out.println( "Processo(" + processos[contador] + ") executando no tempo(" + (cont) + ")" );

			executou++;
			if ( processos[contador] == executou  ) {
				System.out.println("Processo(" + processos[contador] +") finalizado no tempo(" + (cont) + ")" );
				contador++;
				executou = 0;
			}
			if ( contador == processos.length ) {
				break;
			}

			cont++;

			/*Dormir por 1min*/
			try { Thread.sleep(1000); } catch(Exception erro) {}

		} while ( true );
		System.out.println("Fim de processamento.");
	}
}

