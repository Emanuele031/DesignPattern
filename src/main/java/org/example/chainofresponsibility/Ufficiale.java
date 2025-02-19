package org.example.chainofresponsibility;



// Classe astratta per gli ufficiali
public abstract class Ufficiale {
    protected Ufficiale superiore;
    protected int stipendio;

    public void setSuperiore(Ufficiale superiore) {
        this.superiore = superiore;
    }

    public abstract String getRuolo();

    public boolean verificaStipendio(int importo) {
        if (stipendio >= importo) {
            System.out.println(getRuolo() + " può gestire l'importo: " + importo);
            return true;
        } else if (superiore != null) {
            return superiore.verificaStipendio(importo);
        } else {
            System.out.println("Nessun ufficiale può gestire l'importo: " + importo);
            return false;
        }
    }
}

