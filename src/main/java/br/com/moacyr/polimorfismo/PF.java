package br.com.moacyr.polimorfismo;


public class PF extends Pessoa{

    private static final int DIVISOR = 11;
    
	public PF(String documento) {
		super(documento);
	}	
	
	@Override
	public Boolean validarDocumento() {
		
		if (getDocumento().length() != 11) {
			return false;
		}
		
		Integer digitoVerificador1 = converteParaInteger(getDocumento().charAt(9));
		Integer digitoVerificador2 = converteParaInteger(getDocumento().charAt(10));
		
		String documentoSemDV = getDocumento().substring(0, 9);
		
		Integer digitoVerificadorCalculado1 = getDigitoVerificador(documentoSemDV, 1);
		
		Integer digitoVerificadorCalculado2 = getDigitoVerificador(documentoSemDV + digitoVerificadorCalculado1, 0);
		
		
		return digitoVerificador1 == digitoVerificadorCalculado1 && digitoVerificador2 == digitoVerificadorCalculado2;
	}
	
	
	private Integer getDigitoVerificador(String cpf, int acertoDoIndice) {
    	int soma = 0;
    	
    	for (int i=0; i<cpf.length(); i++) {
    		soma += (i+acertoDoIndice) * Integer.parseInt(String.valueOf(cpf.charAt(i)));
    	}
    	
    	int resultado = soma % DIVISOR;
    	
    	if (resultado > 9) {
    		resultado = 0;
    	}
    	
		return resultado;
	}
	
	
}
