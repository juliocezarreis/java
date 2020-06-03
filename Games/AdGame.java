import java.util.Scanner;
import java.util.Random;

public class AdGame {

	static void grafico() {
                System.out.println("********************");
                System.out.println("*Jogo de Advinhação*");
                System.out.println("********************");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random aleatorio = new Random();

		int secreto, tentativas, chute;

		secreto = aleatorio.nextInt(100);
		tentativas = 1;

		grafico();

		while ( true ) {

			System.out.println("\nTentativa " + tentativas);
			System.out.println("Qual é o seu chute?");
			chute = input.nextInt();

			if ( chute < 0 || chute > 99 ) {
				System.out.println("\nNúmero inválido!");
				continue;
			}

			if ( chute == secreto ) {
				System.out.println("\nBEM NA MOSCA! Em " + tentativas + " tentativas");
				System.out.println("Jogar novamente?\n1 - Yeep\n0 - Noop");
				int jogar = input.nextInt();

				if ( jogar == 1 ) {
					tentativas = 1;
					secreto = aleatorio.nextInt(100);
					continue;
				}
				else {
					System.out.println("\nFim de jogo!");
					break;
				}
			}
			else {
				if ( chute < secreto ) {
					System.out.println("\nSeu chute foi menor\n");
				}
				else {
					System.out.println("\nSeu chute foi maior\n");
				}
			}
			tentativas++;
		}
	}
}
