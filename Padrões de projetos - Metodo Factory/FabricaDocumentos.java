public class FabricaDocumentos extends Fabrica {
    @Override
    public Documento criarDocumento(String tipo, int numero, String remetente) {
        switch (tipo) {
            case "Carta":
                return new Carta(numero, remetente);
            case "Notificação":
                return new Notificacao(numero, remetente);
            case "Telegrama":
                return new Telegrama(numero, remetente);
            default:
                throw new IllegalArgumentException("Tipo de documento desconhecido: " + tipo);
        }
    }
}
