package org.example;

public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta();

        //Fazendo depósito
        conta.depositar(22.00);

        //Exibindo saldo
        System.out.println(conta.saldo());

        //Fazendo saque
        conta.sacar(10.00);

        //Exibindo saldo
        System.out.println(conta.saldo());

        //Trabalhando com conta investimento
        ContaInvestimento contaInvestimento = new ContaInvestimento();

        String contaInvesti = contaInvestimento.criarInvestimento(100.00, "Poupança");
        System.out.println(contaInvesti);

        contaInvestimento.listarInvestimento();

        //Trabalhando com conta especial
        ContaEspecial contaEspecial = new ContaEspecial();
        boolean situacao = contaEspecial.definirCredito(1000.00, 1200.00);
        System.out.println("A situação do crédito é: " + situacao);

        contaEspecial.listarCredito();


    }
}