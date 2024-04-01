package org.example;

public class ContaEspecial extends Conta{

    private double creditoDisponivel;

    public ContaEspecial() {
    }

    public ContaEspecial(double saldo, int numero, String nome, double limite, double creditoDisponivel) {
        super(saldo, numero, nome, limite);
        this.creditoDisponivel = creditoDisponivel;
    }

    public double getCreditoDisponivel() {
        return creditoDisponivel;
    }

    public void setCreditoDisponivel(double creditoDisponivel) {
        this.creditoDisponivel = creditoDisponivel;
    }

    boolean definirCredito(double creditoDisponivel, double limite){
        this.creditoDisponivel = creditoDisponivel;
        this.limite = limite;
        return true;
    }

    void listarCredito(){
        System.out.println("Crédito disponível: " + this.creditoDisponivel + " Limite para uso: " + this.limite);
    }
}
