package atividadeHerança2;

public class Pessoa {
    String nome;
    int telefone;

    //Construtor da classe

    public Pessoa(String nome, int telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    //metodo get e metodod set


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getTelefone() {
        return telefone;
    }

    //Metodo toString


    @Override
    public String toString() {
        return "Nome" + this.nome +
                "\nTelefone" + this.telefone;
    }
}
