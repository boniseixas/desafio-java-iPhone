package seso.iphone.phone.sms;

import seso.iphone.phone.Phone;
import seso.iphone.phone.contato.Contato;

public class SMS extends Contato {
    public SMS(String nome, String numero) {
        super(nome, numero);
    }

    public void enviarMensagem() {
        System.out.println("Enviando mensagem");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }
}
