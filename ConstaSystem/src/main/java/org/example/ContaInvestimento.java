package org.example;

public class ContaInvestimento  extends Conta{

    private String tipoInvestimento;

    public ContaInvestimento() {
    }

    public ContaInvestimento(double saldo, int numero, String nome, double limite, String tipoInvestimento) {
        super(saldo, numero, nome, limite);
        this.tipoInvestimento = tipoInvestimento;
    }

    public String getTipoInvestimento() {
        return tipoInvestimento;
    }

    public void setTipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    String criarInvestimento(double quantidade, String tipoInvestimento) {
        this.saldo = this.saldo + quantidade;
        this.tipoInvestimento = tipoInvestimento;
        return "Investimento em " + this.tipoInvestimento + " valor de R$ " + quantidade;
    }


    void listarInvestimento() {
        System.out.println("Investimento em " + this.tipoInvestimento);
    }

}
