package br.edu.fa7.exemploCucumber.model;

public class Conta {

	private double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void saque(double valor) {
		saldo -= valor;
	}
	
	
}
