package seso.iphone;

import seso.iphone.internet.Internet;
import seso.iphone.ipod.Ipod;
import seso.iphone.phone.Phone;

public class Iphone implements Ipod, Phone, Internet {

    @Override
    public void ligar() {
        System.out.println("Ligando para uma contato pelo iPhone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo o telefone pelo iPhone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Conversando pelo correio de voz do Iphone");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Ouvindo música pelo meu Iphone");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Iniciou um chamada e a música foi pausada no Iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando uma música pelo Iphone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Págiana da internet aberta pelo Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova página da internet aberta usando o Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Agora atualizando página pelo Iphone");
    }
}
