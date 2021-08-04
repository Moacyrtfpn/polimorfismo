package br.com.moacyr.polimorfismo;

import java.math.BigDecimal;
import java.util.Arrays;

public class App {

    private static final int DIVISOR = 11;

	public static void main(String[] args) {
    	
		
		PF zeGotinha = new PF("4654657861132");
		PF juquinha = new PF("");
		PF ribamar = new PF("81198277084"); 
    	
    	System.out.println(zeGotinha.validarDocumento());
    	System.out.println(juquinha.validarDocumento());
    	System.out.println(ribamar.validarDocumento());
    	
    	
    }
}
