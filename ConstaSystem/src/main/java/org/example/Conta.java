package org.example;

public class Conta {

    double saldo;
    int numero;
    String nome;
    double limite;

    public Conta() {
    }

    public Conta(double saldo, int numero, String nome, double limite) {
        this.saldo = saldo;
        this.numero = numero;
        this.nome = nome;
        this.limite = limite;
    }

    void sacar(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }

    double depositar(double quantidade) {
        double novoSaldo = this.saldo + quantidade;
        this.saldo = novoSaldo;
        return this.saldo;
    }

    double saldo() {
        return this.saldo;
    }
}
