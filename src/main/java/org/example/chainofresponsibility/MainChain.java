package org.example.chainofresponsibility;



public class MainChain {
    public static void main(String[] args) {
        Ufficiale tenente = new Tenente();
        Ufficiale capitano = new Capitano();
        Ufficiale maggiore = new Maggiore();
        Ufficiale colonnello = new Colonnello();
        Ufficiale generale = new Generale();

        tenente.setSuperiore(capitano);
        capitano.setSuperiore(maggiore);
        maggiore.setSuperiore(colonnello);
        colonnello.setSuperiore(generale);

        tenente.verificaStipendio(3500);
    }
}
//ciao
