Feature: Operacoes Financeiras

	Scenario: Efetuar um debito
		Given uma conta com saldo 1000
		When efetuar um saque de 100
		Then o saldo da conta sera 900
		