package com.developer.rodrigo.screenmatch.calculo;
import com.developer.rodrigo.screenmatch.model.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void incluiDuracao(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
