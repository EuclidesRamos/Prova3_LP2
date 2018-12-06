package prova3;

public class ECom {
	
	private String nomeFantasia;
	private String CNPJ;
	private String proprietario;
	private Tipo tipo;
	private Validador validador = new Validador();
	private double valorArrecadado;
	private double taxaAdicional;

	private void escolheTipo(int idTipo) {
		if (idTipo == 1) {
			this.tipo = new Quiosque(500, 0.05);
		} else if (idTipo == 2) {
			this.tipo = new Barraca(1000, 0.1);
		} else if (idTipo == 3) {
			this.tipo = new Restaurante(5000, 0.2);
		}
	}
	
	public ECom(String nomeFantasia, String CNPJ, String proprietario, int idTipo) {
		this.validador.validaCadastro(nomeFantasia, CNPJ, proprietario, idTipo);
		this.nomeFantasia = nomeFantasia;
		this.CNPJ = CNPJ;
		this.proprietario = proprietario;
		this.escolheTipo(idTipo);
		this.valorArrecadado = 0;
	}


	public String getCNPJ() {
		return this.CNPJ;
	}
	
	@Override
	public String toString() {
		return this.nomeFantasia + " * " + this.CNPJ + " * " + this.proprietario + " * " + this.tipo.getTipo();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CNPJ == null) ? 0 : CNPJ.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ECom other = (ECom) obj;
		if (CNPJ == null) {
			if (other.CNPJ != null)
				return false;
		} else if (!CNPJ.equals(other.CNPJ))
			return false;
		return true;
	}

	public void alteraTipo(int idTipo) {
		this.escolheTipo(idTipo);
	}

	public void informarValorArrecadado(double valor) {
		this.valorArrecadado = valor;
	}

	public double getTaxa() {
		return this.tipo.calculaTaxa(this.valorArrecadado);
	}

	public double totalArrecadado() {
		return this.valorArrecadado;
	}


}
