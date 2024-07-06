package atividadeAssociacao;

import java.util.ArrayList;
import java.util.List;
import java.lang.StringBuilder;


public class Empresa{
    private String nome;
    private int cnpj;
    private Contato responsavel;
    private List<Produto> produtos;

    //Construtor da classe produto
    public Empresa(String nome, int cnpj, Contato responsavel){
        this.nome = nome;
        this.cnpj = cnpj;
        this. responsavel = responsavel;
        this.produtos = new ArrayList<>();
    }

    //Metodo para adicionar e remover produto

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    //Metodo ToString

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Empresa: ").append(nome).append("\n");
        sb.append("CNPJ: ").append(cnpj).append("\n");
        sb.append("Responsáveis: ").append(responsavel).append("\n");
        sb.append("Produtos");
        for (Produto produto : produtos){
            sb.append(produto).append("\n");
        }
        return sb.toString();
    }

}
