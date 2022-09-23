package org.example;

import java.util.ArrayList;

public class ChatDeLabo {
    private ArrayList<Observateur> observateurs = new ArrayList<>();

    public void setObservateur(Observateur observateur) {
        observateurs.add(observateur);
    }

    public void setAction(String value) {
        for(int i = 0; i < observateurs.size(); i++) {
            observateurs.get(i).updateActionObservee(value);
        }
    }
}
