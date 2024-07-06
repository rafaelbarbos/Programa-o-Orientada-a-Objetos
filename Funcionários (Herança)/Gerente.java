package atividadeHerança2;

public class Gerente extends Funcionario {
    private double bonificacao;
    private String tipo;

    //Construtor

    public Gerente(String nome, int telefone, int matricula, double salario, String horario, double bonificacao, String tipo){
        super(nome, telefone, matricula, salario, horario);
        this.bonificacao = bonificacao;
        this.tipo = tipo;
    }

    //Metodos para aumentar salario
    public void aumentarSalario(double percentual){
        super.aumentarSalario(percentual);
    }

    //Metodo para calcular o recebimento anual

    @Override
    public double recebimentoAnual() {
        return (salario + bonificacao)* 12;
    }


    //Metodo get e set

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }
}

