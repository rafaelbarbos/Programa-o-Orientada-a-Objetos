package atividadeHerança2;

public class Funcionario extends Pessoa {
    private int matricula;
    double salario;
    private String horario;


    //Construtor da classe Funcionário
    public Funcionario(String nome, int telefone, int matricula, double salario, String horario){
        super(nome, telefone);
        this.matricula = matricula;
        this.salario = salario;
        this.horario = horario;
    }

    //Metodos publicos
    public void aumentarSalario(double percentual){
        salario += salario *percentual/100;
    }

    public double recebimentoAnual(){
        return salario * 12;
    }


    //Metodo get e metodo set

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
    }

}
