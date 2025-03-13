package negocio;

public class Estante {
	//Propriedades da classe
	private int numero = 0;
	
	//Metodos construtores
	public Estante() {
		super();
	}

	public Estante(int numero) {
		super();
		this.numero = numero;
	}
	
	//Metodos de acesso da classe
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
