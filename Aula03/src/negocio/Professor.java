package negocio;

public class Professor {
	//Propriedades da classe
	private String nome = "";
	private String titulo = "";
	private double salario = 0;
	
	//Metodos construtores
	public Professor() {
		super();
	}

	public Professor(String nome, String titulo, int salario) {
		super();
		this.nome = nome;
		this.titulo = titulo;
		this.salario = salario;
	}
	
	//Metodos de acesso da classe
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
