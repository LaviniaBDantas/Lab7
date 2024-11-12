package org.example;

public class Capuccino extends Template{
    @Override
    void preparaBebida() {
        System.out.println("Preparando capuccino");
    }

    @Override
    void adicionaCondimentos() {
        System.out.println("Adicionando espuma no capuccino");
    }

}
