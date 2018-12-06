package prova3;

public class Restaurante implements Tipo {
	
	private int tus;
	private double ta;

	public Restaurante(int tus, double ta) {
		this.tus += tus;
		this.ta = ta;
	}

	@Override
	public String getTipo() {
		return "RESTAURANTE";
	}

	@Override
	public double calculaTaxa(double valor) {
		return valor * ta + tus;
	}
	
}
