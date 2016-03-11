package br.com.monitoria.model;

public class TorreDeHanoi {
	static int[] pino1 = { 10, 20, 30 };
	static int[] pino2 = new int[3];
	static int[] pino3 = new int[3];

	public static void imprimiTorres() {

		for (int i = 0; i < pino1.length; i++) {
			System.out.print("[" + pino1[i] + "]");
			System.out.print(" [" + pino2[i] + "]");
			System.out.print(" [" + pino3[i] + "]\n");

		}

	}

	public static int pegarDisco(String doPino) {

		if (doPino.equalsIgnoreCase("p1")) {
			return 0;// colocar o retorno certo depois
		} 
		else if (doPino.equalsIgnoreCase("p2")) {
			return 0;// colocar o retorno certo depois
		} 
		else if (doPino.equalsIgnoreCase("p3")) {
			return 0;// colocar o retorno certo depois
		}
		System.out.println("Opção incorreta ");
		return 0;// colocar o retorno certo depois
	}

	public static int colocarDisco(String paraPino) {
		
		if (paraPino.equalsIgnoreCase("p1")) {
			return 0;// colocar o retorno certo depois
		} 
		else if (paraPino.equalsIgnoreCase("p2")) {
			return 0;// colocar o retorno certo depois
		} 
		else if (paraPino.equalsIgnoreCase("p3")) {
			return 0;// colocar o retorno certo depois
		}
		System.out.println("Opção incorreta ");
		return 0;// colocar o retorno certo depois
	}

	public static void main(String[] args) {
		System.out.println("Escolha de qual torre vc quer pegar o disco do topo");
		imprimiTorres();

	}

}
