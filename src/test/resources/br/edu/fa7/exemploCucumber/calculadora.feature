# language: pt

Funcionalidade: Operacoes Financeiras

	Cenário: Efetuar um debito
		Dado uma conta com saldo 1000
		Quando efetuar um saque de 100
		Entao o saldo da conta sera 900
		