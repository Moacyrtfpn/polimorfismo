package br.com.moacyr.polimorfismo;

import java.math.BigDecimal;
import java.util.Arrays;

public class App {

    private static final int DIVISOR = 11;

	public static void main(String[] args) {
    	
		
		PF michel = new PF("06020997901");
		PF zeGotinha = new PF("4654657861132");
		PF juquinha = new PF("");
    	
    	System.out.println(michel.validarDocumento());
    	System.out.println(zeGotinha.validarDocumento());
    	System.out.println(juquinha.validarDocumento());
    	
    	
    }
}
