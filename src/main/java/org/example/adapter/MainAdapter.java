package org.example.adapter;

public class MainAdapter {
    public static void main(String[] args) {
        Info info = new Info("Mario", "Rossi", 1990);
        DataSource adapter = new InfoAdapter(info);
        UserData userData = new UserData(adapter);
        userData.printInfo();
    }
}
