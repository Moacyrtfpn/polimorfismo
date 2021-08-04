package br.com.moacyr.polimorfismo;

public abstract class Pessoa {
	
	private String documento;	
	
	public Pessoa(String documento) {
		this.documento = documento;		
	}
	
	public abstract Boolean validarDocumento();
	
	public String getDocumento() {
		return documento;
	}
	
	public Integer converteParaInteger(char meuChar) {
		return Integer.parseInt(String.valueOf(meuChar));
	}
	
}
