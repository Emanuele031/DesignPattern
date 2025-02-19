package org.example.composite;



import java.util.Arrays;

public class MainComposite {
    public static void main(String[] args) {
        Sezione capitolo1 = new Sezione("Capitolo 1");
        capitolo1.aggiungi(new Pagina(1));
        capitolo1.aggiungi(new Pagina(2));

        Sezione capitolo2 = new Sezione("Capitolo 2");
        capitolo2.aggiungi(new Pagina(3));

        Sezione sezionePrincipale = new Sezione("Sezione Principale");
        sezionePrincipale.aggiungi(capitolo1);
        sezionePrincipale.aggiungi(capitolo2);

        Libro libro = new Libro("Il Mio Libro", Arrays.asList("Mario Rossi", "Luca Bianchi"), sezionePrincipale, 19.99);
        libro.stampa();
    }
}

