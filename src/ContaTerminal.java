

/**
 * 
 * @author Douglas Santos de Jesus
 */

import java.util.Scanner;

public class ContaTerminal {

	/**
	 * @param
	 */
	public static void main(String[] args) {

		int numero = 1021;
		String agencia = "067-8";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira as informações abaixo");
		
		System.out.print("Nome Completo: ");
		String nome_completo = sc.nextLine();
		
		System.out.print("Saldo inicial:");
		double saldo = sc.nextDouble();
		
		System.out.println("Olá, " + nome_completo + " obrigado por criar uma conta em nosso banco:"
				+ "\n Agência: " + agencia
				+ "\n N. Conta: " + numero
				+ "\n Nome completo: " + nome_completo
				+ "\n Saldo: " + saldo
				+ "\n Conta já disponível"
				);
		
	}

}
