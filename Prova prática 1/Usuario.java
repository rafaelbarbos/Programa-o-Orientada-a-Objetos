import java.util.ArrayList;

public class Usuario {
    String nome;
    String email;
    String senha;
    ArrayList<Evento> eventosPatrocinados;

    public Usuario(String nome, String email, String senha){
        this.email = email;
        this.nome = nome;
        this.senha = senha;
        this.eventosPatrocinados = new ArrayList<>();
    }

    public void adicionarEvento(Evento evento){
        eventosPatrocinados.add(evento);
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Usuário{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    public ArrayList<Evento> getEventosParticipados() {
        return eventosPatrocinados;
    }
}
