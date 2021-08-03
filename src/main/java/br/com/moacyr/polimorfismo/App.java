package br.com.moacyr.polimorfismo;

import java.math.BigDecimal;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
    	PF kleber = new PF("549632513");
    	
    	System.out.println(kleber.validarDocumento());
    }
}
