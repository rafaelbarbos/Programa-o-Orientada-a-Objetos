import java.util.ArrayList;

public class Evento {
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private ArrayList<Palestra> palestras;

    public Evento(String descricao){
        this.descricao = descricao;
        this.palestras = new ArrayList<>();
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void adicionarPalestra(String nome, String data, String horaInicial, String horaFinal, String comentario){
        Palestra palestra = new Palestra(nome, data);
        palestra.setHoraInicial(horaInicial);
        palestra.setHoraFinal(horaFinal);
        palestra.setComentario(comentario);
        palestras.add(palestra);
    }

    public void adicionarPalestra(Palestra palestra) {
        palestras.add(palestra);
    }

    public ArrayList<Palestra> getPalestras() {
        return palestras;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "descricao='" + descricao + '\'' +
                ", dataInicio='" + dataInicio + '\'' +
                ", dataFim='" + dataFim + '\'' +
                '}';
    }
}
