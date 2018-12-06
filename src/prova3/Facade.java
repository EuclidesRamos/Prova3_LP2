package prova3;

public class Facade {

	private EComController controller =  new EComController();
	
	public void cadastrarECom(String nomeFantasia, String CNPJ, String proprietario, int idTipo) {
		this.controller.cadastrarECom(nomeFantasia, CNPJ, proprietario, idTipo);
	}
	
	public String recuperarECom(String CNPJ) {
		return this.controller.recuperarECom(CNPJ);
	}
	
	public void alterarTipoECom(String CNPJ, int idTipo) {
		this.controller.alterarTipoECom(CNPJ, idTipo);
	}
	
	public void informarValorArrecadado(String CNPJ, double valor) {
		this.controller.informarValorArrecadado(CNPJ, valor);
	}
	
	public double consultarTaxasDevidas(String CNPJ) {
		return this.controller.consultarTaxasDevidas(CNPJ);
	}
	
	public double consultarTotalArrecadado(String CNPJ) {
		return this.controller.consultarTotalArrecadado(CNPJ);
	}
	
	public String consultarMaiorArrecadado() {
		return this.controller.consultarMaiorArrecadado();
	}
	
	public String consultarMaiorTaxaCobrada() {
		return this.controller.consultarMaiorTaxaCobrada();
	}
}
