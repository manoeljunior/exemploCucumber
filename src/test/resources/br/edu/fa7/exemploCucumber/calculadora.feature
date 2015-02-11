# language: pt

Funcionalidade: Operacoes Financeiras

	Cenário: Efetuar um debito
		Dado uma conta com saldo 1000
		Quando efetuar um saque de 100
		Então o saldo da conta será 900
		