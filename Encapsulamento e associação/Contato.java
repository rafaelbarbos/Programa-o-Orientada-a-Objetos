package atividadeAssociacao;


//Classe contato que representa o contato do responsável
public class Contato {
    //Atributos da classe contato
    private String nome;
    private int telefone;

    //Construtores da classe Contato

    public Contato(String nome, int telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    //Metodo get da classe Contato

    public String getNome(){
        return nome;
    }

    public int getTelefone(){
        return telefone;
    }

    //Metodo set da classe Contato

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTelefone(int telefone){
        this.telefone = telefone;
    }

    //Método tostring

    public String toString(){
        return "Nome: " + this.nome +
                "\nTelefone: " + this.telefone;
    }
}



