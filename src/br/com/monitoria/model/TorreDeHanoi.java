package br.com.monitoria.model;

import java.util.Scanner;
import java.util.Stack;

public class TorreDeHanoi {
	public static int x =3;
	public static Stack<Integer> pino1 = new Stack<Integer>();
	public static Stack<Integer> pino2 = new Stack<Integer>();
	public static Stack<Integer> pino3 = new Stack<Integer>();

	public static void imprimiTorres() {

		System.out.println("p1 ou p2 ou p3\n");
		for (int i = 2; i >= 0; i--) {

			System.out.print("[" + pino1.elementAt(i).intValue()  + "]");
			System.out.print(" [" + pino2.elementAt(i).intValue()  + "]");
			System.out.print(" [" + pino3.elementAt(i).intValue() + "]\n");

		}

	}

	public static int pegar(String origem) {
		if (origem.equalsIgnoreCase("1")) {
			return pino1.pop();
		}
		if (origem.equalsIgnoreCase("2")) {
			return pino2.pop();
		}
		if (origem.equalsIgnoreCase("3")) {
			return pino3.pop();
		}
		System.out.println("Erro");
		return 0;
	}

	public static void colocar(String destino, int disco) {
		if (destino.equalsIgnoreCase("1")) {
			pino1.push(disco);
		}
		if (destino.equalsIgnoreCase("2")) {
			pino1.push(disco);
		}
		if (destino.equalsIgnoreCase("3")) {
			pino1.push(disco);
		}

	}

	public static void main(String[] Args) {
		pino1.push(30);
		pino1.push(20);
		pino1.push(10);
		
		pino2.push(0);
		pino2.push(0);
		pino2.push(0);
		
		pino3.push(0);
		pino3.push(0);
		pino3.push(0);
		Scanner scan = new Scanner(System.in);
		imprimiTorres();

	}

}