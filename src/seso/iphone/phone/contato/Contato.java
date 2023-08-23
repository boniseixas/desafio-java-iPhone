package seso.iphone.phone.contato;

import seso.iphone.phone.Phone;

public class Contato implements Phone {
    private String nome;
    private String numero;

    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public void editarContato() {
        System.out.println("Editando contato");
    }

    public void removerContato() {
        System.out.println("Removendo contato");
    }

    public void  salvarFotoContato() {
        System.out.println("Salvando foto do contato");
    }
    @Override
    public void ligar() {
        System.out.println("Ligando para uma contato");

    }

    @Override
    public void atender() {
        System.out.println("Atendendo o telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Enviando correio de voz!!");
    }
}
