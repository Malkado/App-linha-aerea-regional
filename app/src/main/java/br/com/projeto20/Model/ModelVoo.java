package br.com.projeto20.Model;

public class ModelVoo {
    private String numVoo;
    private String tempoVoo;
    private String precoVoo;
    private String partida;
    private String destino;
    private String tempoPartida;
    private String tempoDestino;

    public ModelVoo() {
    }

    public ModelVoo(String numVoo, String tempoVoo, String precoVoo, String partida, String destino, String tempoPartida, String tempoDestino) {
        this.numVoo = numVoo;
        this.tempoVoo = tempoVoo;
        this.precoVoo = precoVoo;
        this.partida = partida;
        this.destino = destino;
        this.tempoPartida = tempoPartida;
        this.tempoDestino = tempoDestino;
    }

    public String getNumVoo() {
        return numVoo;
    }

    public void setNumVoo(String numVoo) {
        this.numVoo = numVoo;
    }

    public String getTempoVoo() {
        return tempoVoo;
    }

    public void setTempoVoo(String tempoVoo) {
        this.tempoVoo = tempoVoo;
    }

    public String getPrecoVoo() {
        return precoVoo;
    }

    public void setPrecoVoo(String precoVoo) {
        this.precoVoo = precoVoo;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTempoPartida() {
        return tempoPartida;
    }

    public void setTempoPartida(String tempoPartida) {
        this.tempoPartida = tempoPartida;
    }

    public String getTempoDestino() {
        return tempoDestino;
    }

    public void setTempoDestino(String tempoDestino) {
        this.tempoDestino = tempoDestino;
    }
}
