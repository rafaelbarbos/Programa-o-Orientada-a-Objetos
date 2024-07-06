public class EventoPatrocinado extends Evento {
    private String patrocinador;
    private double valor;

    public EventoPatrocinado(String descricao, String patrocinador, double valor) {
        super(descricao);
        this.patrocinador = patrocinador;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    @Override
    public String toString() {
        return "EventoPatrocinado{" +
                "descricao='" + super.getDescricao() + '\'' +
                ", patrocinador='" + patrocinador + '\'' +
                ", valor=" + valor +
                '}';
    }
}
