package prova3;

public class Validador {

	public void validaCadastro(String nomeFantasia, String CNPJ, String proprietario, int idTipo) {
		if (nomeFantasia == null || CNPJ == null || proprietario == null) {
			throw new ParametroCadastroInvalidoException("Paramentro para cadastro nulo!");
		}
		if ("".equals(nomeFantasia.trim()) || "".equals(CNPJ.trim()) || "".equals(proprietario.trim())) {
			throw new ParametroCadastroInvalidoException("Paramentro para cadastro vazio!");
		}
		if (idTipo < 1 || idTipo > 3) {
			throw new ParametroCadastroInvalidoException("Tipo de estabelecimento invalido!");
		}
		
	}

}
