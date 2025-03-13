package negocio;

public class Gerente extends Colaborador {
	private double bonus = 0;

	public Gerente() {
		super();
	}

	public Gerente(int matricula, String nome, double salario, double bonus) {
		super(matricula, nome, salario);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getSalario() {
		return (super.getSalario() + this.getBonus());
	}
}
