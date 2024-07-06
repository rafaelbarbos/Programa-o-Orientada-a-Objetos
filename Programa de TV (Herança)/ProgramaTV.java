package atividadeHerança;

import java.util.ArrayList;

public class ProgramaTV {

    private static int proximoCodigo = 1;

    int codigo;
    String nome;
    ArrayList<Pessoa> artistas = new ArrayList<Pessoa>();
    Pessoa diretor;
    String categoria;

    ProgramaTV(String nome, String categoria) {
        this.codigo = proximoCodigo++;
        this.nome = nome;
        this.categoria = categoria;
    }

    void setDiretor(Pessoa diretor) {
        this.diretor = diretor;
    }

    void setArtistas(Pessoa artista) {
        artistas.add(artista);
    }


    public String toString() {
        String programa = codigo + "-" + nome + " (" + categoria + ")\n";
        programa = programa + "Diretor : " + diretor + "\n";
        programa = programa + "Artistas : \n";
        for (int i = 0; i < artistas.size(); i++) {
            programa = programa + artistas.get(i) + "\n";
        }
        return programa;
    }

}