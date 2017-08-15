package br.unipe.cc.banco;

import java.util.List;

public class Banco {
	
	private List<Conta> contas;
	
	public void debitar(String numeroConta, float valor){
		for (Conta c : contas){
			if(c.getNumConta().equals(numeroConta)){
				c.debitar(valor);
				
			}
		}
		
	}

	public void creditar(String numeroConta, float valor){
		
	}

}
