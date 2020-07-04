import java.util.Scanner;
import javax.swing.JOptionPane;

public class Forca {

	static Scanner input = new Scanner(System.in);
	static char letraAtual;
	static int errosTotais = 0;

	/*Imprime abertura*/
	static void abertura() {
		System.out.println("*******************");
		System.out.println("*  Jogo Da Forca  *");
		System.out.println("*******************");
		System.out.println("  _ _ _ _\n");
		System.out.println(" |       |\n");
		System.out.println(" |		\n");
		System.out.println(" |		\n");
		System.out.println(" |		\n");
		System.out.println("_|_		\n");
	}

	static void imagemVitoria () {
		System.out.println("\nBOA!\n");
		System.out.println("  _ _ _ _\n");
		System.out.println(" |       |            Obrigado!\n");
		System.out.println(" |               (_) /\n");
		System.out.println(" |              --|--\n");
		System.out.println(" |               |-|\n");
		System.out.println("_|_\n\n");
	}

	static void desenhaForca () {
		if ( errosTotais == 0 ) {
			System.out.println("  _ _ _ _\n");
			System.out.println(" |       |\n");
			System.out.println(" |		\n");
			System.out.println(" |		\n");
			System.out.println(" |		\n");
			System.out.println("_|_		\n");
		}
		else if ( errosTotais == 1 ) {
			System.out.println("  _ _ _ _\n");
			System.out.println(" |       |\n");
			System.out.println(" |      (_)\n");
			System.out.println(" |		\n");
			System.out.println(" |		\n");
			System.out.println("_|_		\n");
		}
		else if ( errosTotais == 2 ) {
			System.out.println("  _ _ _ _\n");
			System.out.println(" |       |\n");
			System.out.println(" |      (_)\n");
			System.out.println(" |       |\n");
			System.out.println(" |		\n");
			System.out.println("_|_		\n");
		}
		else if ( errosTotais == 3 ) {
			System.out.println("  _ _ _ _\n");
			System.out.println(" |       |\n");
			System.out.println(" |      (_)\n");
			System.out.println(" |     --|\n");
			System.out.println(" |		\n");
			System.out.println("_|_		\n");
		}
		else if ( errosTotais == 4 ) {
			System.out.println("  _ _ _ _\n");
			System.out.println(" |       |\n");
			System.out.println(" |      (_)\n");
			System.out.println(" |     --|--\n");
			System.out.println(" |		\n");
			System.out.println("_|_		\n");
		}
		else if ( errosTotais == 5 ) {
			System.out.println("\n  _ _ _ _   MORRI!\n");
			System.out.println(" |       | /\n");
			System.out.println(" |      (_)\n");
			System.out.println(" |     --|--\n");
			System.out.println(" |      |-|\n");
			System.out.println("_|_		\n");
			System.out.println("     GAMEOVER\n");
		}
	}

	static void contaErros( String palavra, char[] chutes, int chutesdados ) {

		boolean existe = false;

		for ( int i = 0; i < palavra.length(); i++ ) {

			if ( letraAtual == palavra.charAt(i) ) {
				existe = true;
				break;
			}
		}
		if ( !existe ) {
			errosTotais++;
		}
	}

	/*Verifica se foi enforcado*/
	static boolean enforcou ( String palavra, char[] chutes, int chutesdados ) {

		int erros = 0;

		for ( int i = 0; i < chutesdados; i++ ) {
		
			boolean existe = false;
		
			for ( int j = 0; j < palavra.length(); j++ ) {
				if ( chutes[i] == palavra.charAt(j) ) {
					existe = true;
				}
			}
			if ( !existe ) {
				erros++;
			}
		}
		return erros >= 5;
	}

	/*Verifica se acertou todas as letras*/
	static boolean ganhou ( String palavra, char[] chutes, int chutesdados ) {

		int acertos = 0;

		for ( int i = 0; i < chutesdados; i++ ) {
		
			boolean existe = false;
		
			for ( int j = 0; j < palavra.length(); j++ ) {
				if ( chutes[i] == palavra.charAt(j) ) {
					existe = true;
					acertos++;
				}
			}
			/*if ( existe ) {
				acertos++;
			}*/
		}
		return acertos >= palavra.length();
	}

	public static void main ( String[] args ) {

		abertura();

		String palavra = JOptionPane.showInputDialog(null,"Digite a palavra secreta:");
		char chute;
		char[] chutes = new char[26];
		int chutesdados = 0;

		do {

			/*Imprimindo letras ou traços*/
			for ( int i = 0; i < palavra.length(); i++ ) {

				boolean achou = false;

				for ( int j = 0; j < chutesdados; j++ ) {
					if ( chutes[j] == palavra.charAt(i) ) {
						achou = true;
						break;
					}
				}
				if ( achou ) {
					System.out.print(palavra.charAt(i) + " ");
				}
				else {
					System.out.print("_ ");
				}
			}

			System.out.println();

			/*Recebendo chutes*/
			System.out.print("Qual letra?\nDigite: ");
			chute = input.next().charAt(0);
			System.out.println();
			chutes[chutesdados] = chute;
			letraAtual = chute;
			chutesdados++;

			contaErros(palavra, chutes, chutesdados);
			desenhaForca();
			System.out.println("Erros: " + errosTotais);

			if ( ganhou(palavra, chutes, chutesdados) ) {
				imagemVitoria();
			}

		} while ( !ganhou(palavra, chutes, chutesdados) && !enforcou(palavra, chutes, chutesdados) );
	}
}