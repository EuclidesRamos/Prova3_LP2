package prova3;

public class Quiosque implements Tipo {

	private int tus;
	private double ta;
	
	public Quiosque(int tus, double ta) {
		this.tus += 500;
		this.ta = 0.05;
	}

	@Override
	public String getTipo() {
		return "QUIOSQUE";
	}

	@Override
	public double calculaTaxa(double valor) {
		return valor * ta + tus;
	}
}
