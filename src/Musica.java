public class Musica {
    String titulo;
    String artista;
    int anoLancamneto;
    double avaliacao;
    int numAvaliacoes;

    void fichatecnica (){
        System.out.println("O nome da música é:" + titulo);
        System.out.println("O nome da artista é:" + artista);
        System.out.println("O ano de lançamento é:" + anoLancamneto);
    }

    void avalia(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double Media() {
        return avaliacao / numAvaliacoes;
    }
}
