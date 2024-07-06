package poo;

public class Produto {
    //Atributos da classe
    private int codigo;
    private String nome;
    private int quantidade;
    private String tipo;
    private double valor; //double para representar valores decimais

    //Construtores da classe produto

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Produto(int codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Produto(int codigo, String nome, int quantidade, String tipo, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    //Aplicando o método get

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    //Aplicando método set

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    //Método para venda dos produtos

    public void vender(int quantidadeAVender) {
        if(quantidadeAVender <= 0) {
            System.out.println("Quantidade inválida para venda.");
            return;
        }

        if(this.quantidade >= quantidadeAVender) {
            this.quantidade -= quantidadeAVender; //Novo valor do estoque
            double valorTotal = quantidadeAVender * this.valor;
            System.out.println("Venda concluída com sucesso!");
            System.out.println("O valor total da venda foi de: R$:"+ valorTotal);
        } else {
            System.out.println("Não há essa quantidade disponível para venda.");
        }
    }

    //Método para comprar

    public void comprar(int quantiadeAComprar, double novoValor) {
        this.quantidade += quantiadeAComprar;
        this.valor = novoValor;
        System.out.println("Quantidade em estoque atualizada para: " + this.quantidade);
        System.out.println("Novo valor atualizado para: " + novoValor);
    }

    public void comprar(int quantidadeAComprar) {
        this.quantidade += quantidadeAComprar;
        System.out.println("Quantidade em estoque atualizada parar: "+ this.quantidade);
    }

    //Método para mostrar os atributos de um produto

    public String toString() {
        return "Código: " + this.codigo +
                "\nNome: " + this.nome +
                "\nQuantidade em estoque: " + this.quantidade +
                "\nTipo: " + this.tipo +
                "\nValor: " + this.valor;
    }

    //Método para inserir

    public void inserir(String novoNome, int novaQuantidade, String novoTipo, double novoValor) {
        this.nome = novoNome;
        this.quantidade = novaQuantidade;
        this.tipo = novoTipo;
        this.valor = novoValor;

        System.out.println("Os valores foram atualizados.");
    }


    //Método para comparação

    public boolean igual(Produto outroProduto) {
        //Verifica se os produtos e o tipo são iguais
        return this.nome.equals(outroProduto.getNome()) && this.tipo.equals(outroProduto.getTipo());
    }
}






