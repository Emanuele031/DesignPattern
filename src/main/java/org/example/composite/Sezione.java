package org.example.composite;



import java.util.ArrayList;
import java.util.List;

// Composito: Sezione
public class Sezione implements LibroComponent {
    private String titolo;
    private List<LibroComponent> componenti = new ArrayList<>();

    public Sezione(String titolo) {
        this.titolo = titolo;
    }

    public void aggiungi(LibroComponent componente) {
        componenti.add(componente);
    }

    @Override
    public int getNumeroPagine() {
        return componenti.stream().mapToInt(LibroComponent::getNumeroPagine).sum();
    }

    @Override
    public void stampa() {
        System.out.println("Sezione: " + titolo);
        for (LibroComponent c : componenti) {
            c.stampa();
        }
    }
}

