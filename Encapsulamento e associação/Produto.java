package atividadeAssociacao;

public class Produto{
    private String nome;
    private int tamanho;
    private String tipo;
    private String cor;
    private String especificacao;

    //Construtores da classe produto

    public Produto(String nome, int tamanho, String tipo, String cor, String especificacao){
        this.nome = nome;
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.cor = cor;
        this.especificacao = especificacao;
    }

    //Metodo get da classe produto

    public String getNome(){
        return nome;
    }

    public int getTamanho(){
        return tamanho;
    }

    public String getTipo(){
        return tipo;
    }

    public String getCor(){
        return cor;
    }

    public String getEspecificacao(){
        return especificacao;
    }

    //Metodo set para classe produto

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setEspecificacao(String especificacao){
        this.especificacao = especificacao;
    }

    //Método toString para a classe Produtos
    public String toString(){
        return "Nome: " + this.nome +
                "\nTamanho: " + this.tamanho +
                "\nTipo: " + this.tipo +
                "\nCor: " + this.cor +
                "\nEspecificação: " + this.especificacao;
    }
}
