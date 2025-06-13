package com.developer.rodrigo.screenmatch.models;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void exibirFichaTecnica() {
        System.out.println("Nome do filme: " + this.nome + ".");
        System.out.println("Ano de lançamento: " + this.anoDeLancamento + ".");
        System.out.println("Duração do filme: " + this.duracaoEmMinutos + " minutos.");
        String planopertencente = this.incluidoNoPlano ? "Incluído no plano." : "Não incluso no plano.";
        System.out.println(planopertencente + "\n");
    }

    public void avaliarFilme(double nota) {
        this.somaDasAvaliacoes += nota;
        this.totalDeAvaliacoes++;
    }

    public double buscarMediaAvaliacoesFilme() {
        return this.somaDasAvaliacoes / this.totalDeAvaliacoes;
    }
}
