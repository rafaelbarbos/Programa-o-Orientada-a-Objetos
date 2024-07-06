package atividadeHerança2;

public class Cliente extends Pessoa{
    private int idade;
    private String cpf;
    private char status;

    //Construtor da classe

    public Cliente(String nome, int telefone, int idade, String cpf){
        super(nome, telefone);
        this.idade = idade;
        this.cpf = cpf;
        this.status = 'A';
    }

    //Metodo para desativar cliente
    public void desativarCliente(){
        if(status == 'A'){
            status = 'I';
        }
    }

    //Metodo para mostrar os dados do cliente
    public String mostrarDados(){
        return String.format("%s – Tel:%s – Idade: %d anos – CPF: %s - %s",
                nome, telefone, idade, cpf, status == 'A' ? "ativo" : "inativo");
    }

    //metodo get e set

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public char getStatus(){
        return status;
    }
}
