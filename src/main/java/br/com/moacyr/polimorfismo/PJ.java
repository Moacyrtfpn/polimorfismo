package br.com.moacyr.polimorfismo;

public class PJ extends Pessoa{

	public PJ(String documento) {
		super(documento);
	}

	@Override
	public Boolean validarDocumento() {
		return null;
	}

}
