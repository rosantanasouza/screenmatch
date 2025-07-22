package com.developer.rodrigo.screenmatch.calculo;

public class FiltroRecomendacao {

    public void filtrar(Classificavel classificavel) {
        if(classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os mais bem avaliados." + "(" + classificavel.getClassificacao() + ")");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Está em uma avaliação mediana." + "(" + classificavel.getClassificacao() + ")");
        } else {
            System.out.println("Não foi bem recebido pelo público geral." + "(" + classificavel.getClassificacao() + ")");
        }
    }
}
