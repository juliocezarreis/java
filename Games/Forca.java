import java.util.Scanner;
import javax.swing.JOptionPane;

public class Forca {

	static Scanner input = new Scanner(System.in);

	/*Imprime abertura*/
	static void abertura() {
		System.out.println("*******************");
		System.out.println("*  Jogo Da Forca  *");
		System.out.println("*******************");
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
				}
			}
			if ( existe ) {
				acertos++;
			}
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
			chutes[chutesdados] = chute;
			chutesdados++;

		} while ( !ganhou(palavra, chutes, chutesdados) && !enforcou(palavra, chutes, chutesdados) );
	}
}