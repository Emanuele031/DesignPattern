package org.example.composite;



import java.util.List;

// Libro
public class Libro {
    private String titolo;
    private List<String> autori;
    private LibroComponent contenuto;
    private double prezzo;

    public Libro(String titolo, List<String> autori, LibroComponent contenuto, double prezzo) {
        this.titolo = titolo;
        this.autori = autori;
        this.contenuto = contenuto;
        this.prezzo = prezzo;
    }

    public int getNumeroPagine() {
        return contenuto.getNumeroPagine();
    }

    public void stampa() {
        System.out.println("Titolo: " + titolo);
        System.out.println("Autori: " + String.join(", ", autori));
        System.out.println("Prezzo: " + prezzo + "€");
        contenuto.stampa();
    }
}

