package poo;

public class Pino {

	private int contador = 0;
	private int[] pilha = new int[3];

	public Pino() {
		for (int i = 0; i < pilha.length; i++) {
			pilha[i] = 0;
		}
	}

	public Pino(int x){
		if(x == 1){
		for (int i = 0; i < pilha.length; i++) {
			pilha[i] = (i + 1) * 10;
			}
		}
		contador = 3;
	}

	public void push(int disco) {
		if (contador < 3) {

			pilha[contador] = disco;
			contador++;
		} else {
			System.out.println("jogada ilegal, a pilha ja esta cheia");
		}
	}

	public int pop() {
		int x;
		contador--;
		x = pilha[contador];
		pilha[contador] = 0;
		return x;
	}

	public int[] getPilha() {
		return pilha;
	}

	public int getItemIndex(int index) {
		return pilha[index];
	}
}
