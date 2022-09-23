package org.example;

public class Observateur {
    private ObservationInterface observateur;

    public Observateur(ObservationInterface observateur, ChatDeLabo chat) {
        chat.setObservateur(this);
    }

    public void updateActionObservee(String action) {
        System.out.println(name + " a observé : " + action);
    }

    public String getName() {
        return name;
    }
}
