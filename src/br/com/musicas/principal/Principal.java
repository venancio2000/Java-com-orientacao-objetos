package br.com.musicas.principal;

import br.com.musicas.modelos.MinhasPreferidas;
import br.com.musicas.modelos.Musica;
import br.com.musicas.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");


        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPoscast = new Podcast();
        meuPoscast.setTitulo("Bolhadev");
        meuPoscast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            meuPoscast.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            meuPoscast.curte();
        }
        System.out.println(minhaMusica.getTotalReproducoes());

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(minhaMusica);
        minhasPreferidas.inclui(meuPoscast);

    }
}