package org.example.composite;



// Foglia: Pagina
public class Pagina implements LibroComponent {
    private int numero;

    public Pagina(int numero) {
        this.numero = numero;
    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }

    @Override
    public void stampa() {
        System.out.println("Pagina " + numero);
    }
}

