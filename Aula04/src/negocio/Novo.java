package negocio;

public class Novo extends Imovel {
	private double adicional = 0;

	//Metodos construtores da classe
	public Novo() {
		super();
	}

	public Novo(String endereço, double metragem, double valor, double adicional) {
		super(endereço, metragem, valor);
		this.adicional = adicional;
	}

	//Metodos de acesso da classe
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	//Metodos sobescritores da classe
	public double getValor() {
		return (super.getValor() + this.getAdicional());
	}
	
	

}
