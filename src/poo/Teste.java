package poo;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Pino pino1 = new Pino(1);
		Pino pino2 = new Pino();
		Pino pino3 = new Pino();
		Scanner scan = new Scanner(System.in);
		int origem = 0;
		int destino = 0;
		int disco = 0;

		do {
			System.out.println("1 -- 2 -- 3");
			for (int i = 0; i < pino1.getPilha().length; i++) {
				System.out.print("[" + pino1.getItemIndex(i) + "] ");
				System.out.print("[" + pino2.getItemIndex(i) + "] ");
				System.out.print("[" + pino3.getItemIndex(i) + "]\n");
			}
			System.out.println("Pegar de:");
			origem = scan.nextInt();
			

			switch (origem) {
			case 1:
				disco = pino1.pop();
				break;
			case 2:
				disco = pino2.pop();
				break;
			case 3:
				disco = pino3.pop();
				break;
			default:
				System.out.println("escolha invalida");
				break;
			}

			System.out.println("Escolha o destino:");
			scan.nextInt();
		

			switch (destino) {
			case 1:
				pino1.push(disco);
				break;
			case 2:
				pino2.push(disco);
				break;
			case 3:
				pino3.push(disco);
				break;
			default:
				System.out.println("escolha invalida");
				break;
			}

			// fim do game
		} while (true);

	}

}
