package br.edu.fa7.exemploCucumber.steps;

import static org.junit.Assert.assertEquals;
import br.edu.fa7.exemploCucumber.model.Conta;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class StepDef {

	private Conta conta;
	
	@Dado("^uma conta com saldo (\\d+)$")
	public void uma_conta_com_saldo(double saldo) throws Throwable {
	    conta = new Conta(saldo);
	}

	@Quando("^efetuar um saque de (\\d+)$")
	public void efetuar_um_saque_de(double valor) throws Throwable {
	    conta.saque(valor);
	}

	@Entao("^o saldo da conta será (\\d+)$")
	public void o_saldo_da_conta_sera(double saldo) throws Throwable {
	    assertEquals(saldo, conta.getSaldo(), 0.0001);
	}
}
