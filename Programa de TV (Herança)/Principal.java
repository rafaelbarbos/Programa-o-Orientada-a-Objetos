package atividadeHerança;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<ProgramaTV> programas = new ArrayList<>();

        // Cria programas de TV sem informar o código (ele é gerado automaticamente)
        ProgramaTV p = new ProgramaTV("O outro lado do paraíso", "Novela");
        p.setDiretor(new Pessoa("Diretor 1", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 1", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 2", "Brasileiro"));
        programas.add(p);

        p = new ProgramaTV("Orgulho e Paixão", "Novela");
        p.setDiretor(new Pessoa("Diretor 2", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 3", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 4", "Brasileiro"));
        programas.add(p);

        p = new ProgramaTV("Marley e eu", "Filme");
        p.setDiretor(new Pessoa("Diretor 3", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 5", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 6", "Brasileiro"));
        programas.add(p);

        p = new ProgramaTV("Show Ivete Sangalo", "Show");
        p.setDiretor(new Pessoa("Diretor 4", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 7", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 8", "Brasileiro"));
        programas.add(p);

        Serie s1 = new Serie("Game of thrones", "Série", 8, 73);
        s1.setDiretor(new Pessoa("Diretor A", "Americano"));
        s1.setArtistas(new Pessoa("Artista A", "Britânico"));
        s1.setArtistas(new Pessoa("Artista B", "Americano"));
        programas.add(s1);

        Serie s2 = new Serie("The office", "Série", 9, 201);
        s2.setDiretor(new Pessoa("Diretor B", "Americano"));
        s2.setArtistas(new Pessoa("Artista C", "Americano"));
        s2.setArtistas(new Pessoa("Artista D", "Americano"));
        programas.add(s2);

        // Exibe os programas criados
        for (ProgramaTV programa : programas) {
            System.out.println(programa);
        }
    }
}
