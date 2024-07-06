package atividadeAssociacao;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empresa> empresas = new ArrayList<>();

        //loop para cadrastar empresas
        boolean cadastrarEmpresa = true;
        while (cadastrarEmpresa) {
            //Mostrar mensagem para cadrastrar empresa
            String resposta = JOptionPane.showInputDialog("Cadatrar nova empresa? (S/N)");
            cadastrarEmpresa = resposta != null && resposta.equalsIgnoreCase("S");

            if (cadastrarEmpresa) {
                String nome = JOptionPane.showInputDialog("Digite o nome da empresa: ");
                String cnpjStr = JOptionPane.showInputDialog("Digite o cnpj da empresa: ");
                int cnpj = Integer.parseInt(cnpjStr); //Converte o dado para o tipo inteiro
                String nomeResponsavel = JOptionPane.showInputDialog("Digite o nome do responsável");
                String telefoneResponsavelStr = JOptionPane.showInputDialog("Digite o telefone do responsável: ");
                int telefoneResponsável = Integer.parseInt(telefoneResponsavelStr); //Converte o dado para o tipo inteiro
                Contato responsavel = new Contato(nomeResponsavel, telefoneResponsável);
                Empresa empresa = new Empresa(nome, cnpj, responsavel);

                //Loop para recadastrar produtos
                boolean cadastrarProduto = true;
                while (cadastrarProduto) {
                    //Verifica se o usuario quer cadastrar produtos
                    resposta = JOptionPane.showInputDialog("Cadastrar novo produto? (S/N)");
                    cadastrarProduto = resposta != null & resposta.equalsIgnoreCase("S");

                    if (cadastrarProduto) {
                        //Lê os dados do produto
                        String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto: ");
                        String tamanhoStr = JOptionPane.showInputDialog("Digite o tamanho do produto: ");
                        int tamanho = Integer.parseInt(tamanhoStr);
                        String tipo = JOptionPane.showInputDialog("Digite o tipo do produto: ");
                        String cor = JOptionPane.showInputDialog("Digite a cor do produto: ");
                        String especificacao = JOptionPane.showInputDialog("Digite a especificação do produto: ");
                        Produto produto = new Produto(nomeProduto, tamanho, tipo, cor, especificacao);

                        //Adiciona o produto na lista de produtos da empresa
                        empresa.adicionarProduto(produto);
                    }
                }
                //Adicionar empresa na lista de empresas
                empresas.add(empresa);
            }
        }
        //Mostra as empresas com seus produtos
        StringBuilder sb = new StringBuilder();
        for (Empresa empresa : empresas) {
            sb.append(empresa).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
