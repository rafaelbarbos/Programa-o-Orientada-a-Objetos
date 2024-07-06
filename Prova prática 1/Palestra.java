public class Palestra {
    private String nome;
    private String data;
    private String horaInicial;
    private String horaFinal;
    private String comentario;

    public Palestra(String nome, String data){
        this.nome = nome;
        this.data = data;
    }

    public Palestra(String nome, String data, String horaInicial, String horaFinal, String comentario) {
        this.nome = nome;
        this.data = data;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.comentario = comentario;
    }

    public String getNome() {
        return nome;
    }

    public String getComentario() {
        return comentario;
    }

    public String getData() {
        return data;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public String getHoraInicial() {
        return horaInicial;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public void setHoraInicial(String horaInicial) {
        this.horaInicial = horaInicial;
    }

    @Override
    public String toString() {
        return "Palestra{" +
                "nome='" + nome + '\'' +
                ", data='" + data + '\'' +
                ", horaInicial='" + horaInicial + '\'' +
                ", horaFinal='" + horaFinal + '\'' +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
