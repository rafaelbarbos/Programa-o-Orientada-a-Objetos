public class CadastroDocumentos {
    private Fabrica fabrica;

    public CadastroDocumentos() {
        this.fabrica = new FabricaDocumentos();
    }

    public void cadastrarDocumento(String tipo, int numero, String remetente) {
        Documento documento = fabrica.criarDocumento(tipo, numero, remetente);
        documento.exibirInfo();
    }

    public static void main(String[] args) {
        CadastroDocumentos cadastro = new CadastroDocumentos();
        cadastro.cadastrarDocumento("Carta", 101, "Alice");
        cadastro.cadastrarDocumento("Notificação", 102, "Bob");
        cadastro.cadastrarDocumento("Telegrama", 103, "Charlie");
    }
}
