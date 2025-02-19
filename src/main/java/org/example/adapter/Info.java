package org.example.adapter;

public class Info {
    private String nome;
    private String cognome;
    private int annoNascita;

    public Info(String nome, String cognome, int annoNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.annoNascita = annoNascita;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getDataDiNascita() {
        return annoNascita;
    }
}
