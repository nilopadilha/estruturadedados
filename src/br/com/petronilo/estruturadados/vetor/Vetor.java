package br.com.petronilo.estruturadados.vetor;

public class Vetor {

	/*
	 * por padrão quando se instancia um vetor de string no java, todos os elementos
	 * teraõ valor null, que é o valor inicial de uma string do java. caso seja um
	 * vetor de Boolean o valor inicial será false. caso seja um vetor de inteiro ou
	 * qualque tipo primitivo que represente número no java o valor inicial será
	 * zero.
	 * 
	 */
	private String[] elementos;

	public Vetor(int capacidade) {
		super();
		this.elementos = new String[capacidade];
	}

	public void adicionaElemento(String elemento) {
		for (int i = 0; i < this.elementos.length; i++) {
			if(this.elementos[i]== null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}

}
