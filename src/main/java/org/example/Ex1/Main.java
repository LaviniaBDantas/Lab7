package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Padrao Template!");
        Capuccino capuccino = new Capuccino();
        capuccino.preparaReceita();

        Cafe cafe = new Cafe();
        cafe.preparaReceita();

        Cha cha= new Cha();
        cha.preparaReceita();
    }
}