package org.example.adapter;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        return 2025 - info.getDataDiNascita(); // Calcola età basata sull'anno di nascita
    }
}
