package Atividade;

public class ContaCorrente extends Conta{
    //Taxa fixa
    private static final double TAXA = 0.05;

    //Construtor da classe

    public ContaCorrente(int numero, Cliente dono){
        super(numero, dono);
    }

    //Metodo sacar
    @Override
    public void sacar(double valor){
        double valorComTaxa = valor + TAXA;
        if (saldo >= valorComTaxa){
            saldo -= valorComTaxa;
        }else{
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    //Metodo para depositar
    public void depositar(double valor){
        double valorComTaxa = valor - TAXA;
        if (valorComTaxa >= 0){
            saldo = valorComTaxa;
        }
    }
}
