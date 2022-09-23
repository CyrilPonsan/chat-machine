package org.example;

public class Observateur {
    private String name;

    public Observateur(String name, ChatDeLabo chat) {
        this.name = name;
        chat.setObservateur(this);
    }

    public void updateActionObservee(String action) {
        System.out.println(name + " a observé : " + action);
    }

    public String getName() {
        return name;
    }
}
