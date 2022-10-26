package br.atividade22_10_25;

import java.text.DecimalFormat;

public class Conta {
    private Double saldo;
    private Double valorSaque;

    public Conta(Double saldo, Double valorSaque) {
        this.saldo = saldo;
        this.valorSaque = valorSaque;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getValorSaque() {
        return valorSaque;
    }

    public void setValorSaque(Double valorSaque) {
        this.valorSaque = valorSaque;
    }

    public void saque(Double saldo, Double valorSaque) throws IllegalArgumentException {
        if (valorSaque > 400.00) {
            throw new IllegalArgumentException("Valor do saque não pode ser maior que R$400,00");
        }
        if (valorSaque > saldo) {
            throw new IllegalArgumentException("Valor do saque não pode ser maior que o saldo");
        }
        this.saldo = saldo - valorSaque;

    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return "Saque de " +
                df.format(valorSaque) +
                " Reais realizado com sucesso.\nSaldo atual: " +
                df.format(saldo);
    }
}
