package Atividade;

import java.text.DecimalFormat;

public abstract class Conta {
    protected int numero;
    protected Cliente dono;
    protected double saldo;

    Conta (int numero, Cliente dono) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }


    public void transferir(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de " + valor + " realizada de " + this.numero + " para " + destino.numero);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }



    public void setSaldo(double valor) {
        saldo = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("#0.00");
        return "Número : " + numero + " - Cliente : " + dono.getNome() + "-" + dono.getTelefone() + " - saldo : " + df.format(saldo);
    }

}
