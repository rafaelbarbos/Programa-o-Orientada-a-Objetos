package Atividade;

public class Cliente {
    private String nome;
    private int telefone;

    //Construtores

    public Cliente(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    //Metodos de acesso get e set

    public int getTelefone() {
        return telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}