public class Pessoa {
    String nome;
    int idade;
    double salario;
    int dependentes;

    //Cosntruto da classe seguindo os parâmetros da classe de teste
    public Pessoa(String nome, double salario, int dependentes, int idade){
        this.nome = nome;
        this.salario = salario;
        this.dependentes = dependentes;
        this.idade = idade;

    }

    //Método para calcular imposto seguindo a tabela e o requisito de idade
    public double calculaImposto(){
        if(idade >= 65){
            return 0.0;
        }
        double imposto;
        if(salario <= 1787.77){
            imposto = 0.0;
        }else if(1787.78 <= salario && salario <= 2679.29){
            imposto = salario * 0.075 - 134.08;
        }else if(2679.30 <= salario && salario <= 3572.43){
            imposto = salario * 0.15 - 335.03;
        }else if(3572.44 <= salario && salario <= 4463.81){
            imposto = salario * 0.225 -602.96;
        }else{
            imposto = salario * 0.275 - 826.15;
        }

        double impostoFinal = imposto - (dependentes*179.71);

        return Math.max(impostoFinal,0.0); //Impede que o imposto retornado seja negativo
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
