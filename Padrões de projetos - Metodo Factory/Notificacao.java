public class Notificacao extends Documento {
    public Notificacao(int numero, String remetente) {
        super(numero, remetente, "Notificação");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Notificação [Número: " + numero + ", Remetente: " + remetente + ", Tipo: " + tipo + "]");
    }
}