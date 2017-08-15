package br.unipe.cc.banco;

public class Conta {
	public float saldo;
	public String numConta;
	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void debitar(float valor){
		getSaldo();
		if (saldo >= valor){
			saldo = saldo - valor;
		}
		else{
			System.out.println("Saldo Insuficiente");
		}
		
	}
	public void creditar(float valor){
		getSaldo();
		saldo = saldo + valor;
		
	}
}
