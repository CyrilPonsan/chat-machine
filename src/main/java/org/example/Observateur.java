package org.example;

public class Observateur {
    private ObservationInterface observateur;


    public Observateur(ObservationInterface observateur, ChatDeLabo chat) {
        this.observateur = observateur;
        chat.setObservateur(this);
    }

    public void updateActionObservee(String action) {
        observateur.observe(action);
    }
}
