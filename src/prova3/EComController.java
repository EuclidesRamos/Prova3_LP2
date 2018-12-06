package prova3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EComController {
	
	private Set<ECom> estabelecimentos;
	private Validador validador;
	
	public EComController() {
		this.estabelecimentos =  new HashSet<>();
		this.validador = new Validador();
	}
	
	public void cadastrarECom(String nomeFantasia, String CNPJ, String proprietario, int idTipo) {
		this.validador.validaCadastro(nomeFantasia, CNPJ, proprietario, idTipo);
		this.estabelecimentos.add(new ECom(nomeFantasia, CNPJ, proprietario, idTipo));
	}

	public String recuperarECom(String CNPJ) {
		for (ECom ecom : this.estabelecimentos) {
			if (CNPJ.equals(ecom.getCNPJ())) {
				return ecom.toString();
			}
		}
		throw new CNPJNaoCadastradoException("CNPJ nao cadastrado!");
		
	}

	public void alterarTipoECom(String CNPJ, int idTipo) {
		boolean verificador = false;
		for (ECom ecom : this.estabelecimentos) {
			if (CNPJ.equals(ecom.getCNPJ())) {
				ecom.alteraTipo(idTipo);
				verificador = true;
			}
		}
		
		if (!verificador) {
			throw new CNPJNaoCadastradoException("CNPJ nao cadastrado!");
		}
		
	}

	public void informarValorArrecadado(String CNPJ, double valor) {
		boolean verificador = false;
		for (ECom ecom : this.estabelecimentos) {
			if (CNPJ.equals(ecom.getCNPJ())) {
				ecom.informarValorArrecadado(valor);
			}
		}
		if (!verificador) {
			throw new CNPJNaoCadastradoException("CNPJ nao cadastrado!");
		}
		
	}

	public double consultarTaxasDevidas(String CNPJ) {
		for (ECom ecom : this.estabelecimentos) {
			if (CNPJ.equals(ecom.getCNPJ())) {
				return ecom.getTaxa();
			}
		}
		throw new CNPJNaoCadastradoException("CNPJ nao cadastrado!");
	}

	public double consultarTotalArrecadado(String CNPJ) {
		for (ECom ecom : this.estabelecimentos) {
			if (CNPJ.equals(ecom.getCNPJ())) {
				return ecom.totalArrecadado();
			}
		}
		throw new CNPJNaoCadastradoException("CNPJ nao cadastrado!");
	}

	public String consultarMaiorArrecadado() {
		List<ECom> estabelecimentos =  new ArrayList<>(this.estabelecimentos);
		return Collections.max(estabelecimentos, new TotalArrecadadoComparator()).toString();
	}
	
	public String consultarMaiorTaxaCobrada() {
		List<ECom> estabelecimentos =  new ArrayList<>(this.estabelecimentos);
		return Collections.max(estabelecimentos, new TaxaCobradaComparator()).toString();
		
	}

}
