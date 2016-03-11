package br.com.monitoria.model;

import java.util.Scanner;

public class TorreDeHanoi {
	public static int cont1 = 2;
	public static int cont2 = 0;
	public static int cont3 = 0;
	public static int[] pino1 = { 10, 20, 30 };
	public static int[] pino2 = new int[3];
	public static int[] pino3 = new int[3];

	public static void imprimiTorres() {
		
		System.out.println("p1 ou p2 ou p3\n");
		for (int i = 0; i < pino1.length; i++) {
			
			
			System.out.print("[" + pino1[i] + "]");
			System.out.print(" [" + pino2[i] + "]");
			System.out.print(" [" + pino3[i] + "]\n");

		}

	}

	public static int pegarDisco(String doPino) {

		if (doPino.equalsIgnoreCase("p1")) {
			int x;
			if (cont1 >= -1) {
				x = pino1[cont1];
				pino1[cont1] = 0;
				cont1--;
				return x;
			}
			System.out.println("nao pegou do pino 1");

			return 0;// colocar o retorno certo depois
		}

		else if (doPino.equalsIgnoreCase("p2")) {

			int x;
			if (cont2 >= -1) {
				x = pino2[cont2];
				pino1[cont1] = 0;
				cont1--;
				return x;
			}
			System.out.println("nao pegou do pino 1");

			return 0;// colocar o retorno certo depois
		}

		else if (doPino.equalsIgnoreCase("p3")) {

			int x;
			if (cont3 >= -1) {
				x = pino3[cont3];
				pino3[cont3] = 0;
				cont1--;
				return x;
			}
			System.out.println("nao pegou do pino 1");
			return 0;// colocar o retorno certo depois
		}
		System.out.println("Opção incorreta ");
		return 0;// colocar o retorno certo depois
	}

	public static void colocarDisco(String paraPino, int valorDisco) {

		if (paraPino.equalsIgnoreCase("p1")) {

			if (valorDisco < pino1[cont1]) {
				if (cont1 >= -1) {
					pino1[cont1] = valorDisco;
					cont1++;

				}
			}
			System.out.println("nao colocou no pino 1");

		}

		else if (paraPino.equalsIgnoreCase("p2")) {

			if (valorDisco < pino2[cont2]) {
				if (cont1 >= -1) {
					pino2[cont2] = valorDisco;
					cont2++;

				}
			}
			System.out.println("nao colocou no pino 2");

		} else if (paraPino.equalsIgnoreCase("p3")) {

			if (valorDisco < pino3[cont3]) {
				if (cont1 >= -1) {
					pino3[cont3] = valorDisco;
					cont3++;

				}
			}
			System.out.println("nao colocou no pino 1");

		}
		System.out.println("Opção incorreta ");

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int discoNaMao;

		do {
			System.out.println("Escolha de qual torre vc quer pegar o disco do topo");
			imprimiTorres();
			discoNaMao = pegarDisco(scan.nextLine());

		} while (true);

	}

}
