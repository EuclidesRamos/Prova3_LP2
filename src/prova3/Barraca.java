package prova3;

public class Barraca implements Tipo {
	
	private int tus;
	private double ta;
	
	public Barraca(int tus, double ta) {
		this.tus += tus;
		this.ta = ta;
	}

	@Override
	public String getTipo() {
		return "BARRACA";
	}

	@Override
	public double calculaTaxa(double valor) {
		return valor * ta + tus;
	}

}
