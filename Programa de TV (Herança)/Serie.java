package atividadeHerança;

public class Serie extends ProgramaTV {
    int quantidadeTemporadas;
    int quantidadeEspisodios;

    //Construtor da classe
    Serie(String nome, String categoria, int quantidadeTemporadas, int quantidadeEspisodios){
        super(nome, categoria); //chama o construtor de ProgramaTV
        this.quantidadeTemporadas = quantidadeTemporadas;
        this.quantidadeEspisodios = quantidadeEspisodios;
    }

    @Override
    public String toString() {
        String serieInfo = super.toString(); //chama toString de ProgramaTV
        serieInfo += "Temporadas: " + quantidadeTemporadas + "\n";
        serieInfo += "Espisodios: " + quantidadeEspisodios + "\n";
        return serieInfo;
    }



}
