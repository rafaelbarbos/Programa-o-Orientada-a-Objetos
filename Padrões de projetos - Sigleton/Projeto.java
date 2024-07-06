class Projeto {
    private String nome;
    private String descricao;
    private double orcamento;
    private String dataInicio;
    private String dataTermino;
    private Empresa empresa;

    public Projeto(String nome, String descricao, double orcamento, String dataInicio, String dataTermino) {
        this.nome = nome;
        this.descricao = descricao;
        this.orcamento = orcamento;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.empresa = Empresa.getInstance(); // Vinculando à empresa Singleton
        this.empresa.addProjeto(this);
    }

    public String getInfo() {
        return "Projeto: " + nome + "\n" +
                "Descrição: " + descricao + "\n" +
                "Orçamento: R$" + orcamento + "\n" +
                "Data de Início: " + dataInicio + "\n" +
                "Data de Término: " + dataTermino + "\n" +
                "Empresa: " + empresa.getNome() + "\n";
    }


    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
}
