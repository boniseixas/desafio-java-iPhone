package seso.iphone.ipod.musica;

import seso.iphone.Iphone;
import seso.iphone.ipod.Ipod;

import java.sql.Time;

public class Musica implements Ipod {

    private String nomeMusica;
    private String autor;
    private Time duracao;

    public Musica(String nomeMusica, String autor, Time duracao) {
        this.nomeMusica = nomeMusica;
        this.autor = autor;
        this.duracao = duracao;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public String getAutor() {
        return autor;
    }

    public Time getDuracao() {
        return duracao;
    }


    @Override
    public void tocarMusica() {
        System.out.println("Ouvindo música");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }
}
