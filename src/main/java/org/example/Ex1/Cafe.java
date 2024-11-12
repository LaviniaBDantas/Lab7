package org.example;

public class Cafe extends Template{
    @Override
    void preparaBebida() {
        System.out.println("Preparando café");
    }

    @Override
    void adicionaCondimentos() {
        System.out.println("Adicionando leite no café");
    }
}
