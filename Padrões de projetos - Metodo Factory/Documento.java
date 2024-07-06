public abstract class Documento {
    protected int numero;
    protected String remetente;
    protected String tipo;

    public Documento(int numero, String remetente, String tipo) {
        this.numero = numero;
        this.remetente = remetente;
        this.tipo = tipo;
    }

    public abstract void exibirInfo();
}
