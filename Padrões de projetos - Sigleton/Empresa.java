import java.util.ArrayList;
import java.util.List;


class Empresa {
    private static Empresa instance;
    private String nome;
    private String cnpj;
    private String endereco;
    private String cep;
    private List<Projeto> projetos;


    private Empresa() {
        this.nome = "EBM INCORPORACOES S/A";
        this.cnpj = "03.025.881/0002-74";
        this.endereco = "Rua T 55, 930 SETOR BUENO GOIANIA – GO";
        this.cep = "74215-170";
        this.projetos = new ArrayList<>();
    }

    // Método estático para obter a única instância da empresa
    public static synchronized Empresa getInstance() {
        if (instance == null) {
            instance = new Empresa();
        }
        return instance;
    }

    public void addProjeto(Projeto projeto) {
        projetos.add(projeto);
    }

    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Empresa: ").append(nome).append("\n")
                .append("CNPJ: ").append(cnpj).append("\n")
                .append("Endereço: ").append(endereco).append("\n")
                .append("CEP: ").append(cep).append("\n")
                .append("Projetos: \n");

        for (Projeto projeto : projetos) {
            info.append("  - ").append(projeto.getNome()).append("\n");
        }
        return info.toString();
    }

    // Getters para os atributos da empresa
    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCep() {
        return cep;
    }
}