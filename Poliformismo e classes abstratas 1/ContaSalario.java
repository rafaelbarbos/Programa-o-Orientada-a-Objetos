package Atividade;

public class ContaSalario extends ContaCorrente {
    private static final double TAXA_SALARIO = 0.01; // Taxa reduzida para ContaSalario

    public ContaSalario(int numero, Cliente dono) {
        super(numero, dono);
    }

    @Override
    public void sacar(double valor) {
        if (valor + TAXA_SALARIO <= saldo) {
            saldo -= (valor + TAXA_SALARIO);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += (valor - TAXA_SALARIO);
    }

    @Override
    public String toString() {
        return "ContaSalario [" + super.toString() + "]";
    }
}

