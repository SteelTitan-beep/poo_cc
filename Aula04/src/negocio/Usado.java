package negocio;

public class Usado extends Imovel{
	private double depreciacao = 0;
	
	//Metodos de construção da classe
	public Usado() {
		super();
	}

	public Usado(String endereço, double metragem, double valor, double depreciacao) {
		super(endereço, metragem, valor);
		this.depreciacao = depreciacao;
	}
	
	//Metodos de acesso da classe
	public double getDepreciacao() {
		return depreciacao;
	}

	public void setDepreciacao(double depreciacao) {
		this.depreciacao = depreciacao;
	}
	
	//Metodos sobescritores da classe
	public double getValor() {
		return (super.getValor() - this.getDepreciacao());
	}
	

}
