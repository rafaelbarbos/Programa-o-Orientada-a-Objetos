public class Carta extends Documento {
    public Carta(int numero, String remetente) {
        super(numero, remetente, "Carta");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Carta [Número: " + numero + ", Remetente: " + remetente + ", Tipo: " + tipo + "]");
    }
}