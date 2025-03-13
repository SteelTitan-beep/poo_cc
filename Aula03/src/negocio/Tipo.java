package negocio;

public class Tipo {
	private String descricao = "";

	public Tipo() {
		super();
	}

	public Tipo(String descricao) {
		super();
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
