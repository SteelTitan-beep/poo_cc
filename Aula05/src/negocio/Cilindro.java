package negocio;

public class Cilindro {
	
	private double raio = 0;
	private double altura = 0;
	public Cilindro() {
		super();
	}
	
	public Cilindro(double raio, double altura) {
		super();
		this.raio = raio;
		this.altura = altura;
	}
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	

}
