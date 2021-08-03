package br.com.moacyr.polimorfismo;

import java.math.BigDecimal;

public class Subtracao extends OperacaoMatematica{
	
	public Subtracao(Integer n1, Integer n2) {
		super(n1, n2);
		
	}

	public BigDecimal calcular() {
        return super.getX().subtract(getY());
    }
}
