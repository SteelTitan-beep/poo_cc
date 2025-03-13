package negocio;

public abstract class Drink {
	private Ingrediente[] colecao = new Ingrediente[10];
	private int qtdIngredientes = 0;
	
	public void adicionar(Ingrediente objIngrediente) {
		colecao[qtdIngredientes] = objIngrediente;
		qtdIngredientes++;
	}
	
	public void beber() {
		for (int i = 0 ; i < qtdIngredientes ; i++) {
			System.out.println(colecao[i].getQuantidade() + " " + colecao[i].getUnidade() + " de " + colecao[i].getNome());
		}
	}
	

}
