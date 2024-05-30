package br.com.musicas.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalcurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalcurtidas() {
        return totalcurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte(){
        this.totalcurtidas++;
    }
    public void reproduz(){
        this.totalReproducoes++;
    }
}
