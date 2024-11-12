package org.example;

public abstract class Template {
    abstract void preparaBebida();
    abstract void adicionaCondimentos();
    public void preparaReceita(){
        aqueceAgua();
        preparaBebida();
        colocaXicara();
        adicionaCondimentos();
    }

    private void colocaXicara() {
        System.out.println("Coloca na xicara");
    }

    private void aqueceAgua() {
        System.out.println("\nAquecendo água");
    }
}
