package org.example.adapter;

public class UserData {
    private DataSource dataSource;

    public UserData(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void printInfo() {
        System.out.println("Nome: " + dataSource.getNomeCompleto());
        System.out.println("Età: " + dataSource.getEta());
    }
}
