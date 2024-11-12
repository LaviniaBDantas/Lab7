package org.example;

public class Cha extends Template{
    @Override
    void preparaBebida() {
        System.out.println("Preparando cha");
    }

    @Override
    void adicionaCondimentos() {
        System.out.println("Adicionando açúcar no chá");
    }
}
