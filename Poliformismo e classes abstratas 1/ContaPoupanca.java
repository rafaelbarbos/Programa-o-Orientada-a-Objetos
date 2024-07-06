package Atividade;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, Cliente dono){
        super(numero, dono);
    }

    //Metodo atualizar saldo
    public void atualizaSaldo(double percentual){
        if (percentual > 0){
            saldo = saldo * (percentual / 100);
        }else{
            System.out.println("Percentual inválido!");
        }
    }
}
