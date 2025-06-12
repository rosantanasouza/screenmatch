public class Filme {
    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;


    void exibirFichaTecnica() {
        System.out.println("Nome do filme: " + nome + ".");
        System.out.println("Ano de lançamento: " + anoDeLancamento + ".");
        System.out.println("Duração do filme: " + duracaoEmMinutos + " minutos.");
        String planopertencente = incluidoNoPlano ? "Incluído no plano." : "Não incluso no plano.";
        System.out.println(planopertencente);
        System.out.println();
    }

    void avaliar(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double buscarMediaAvaliacoes() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
