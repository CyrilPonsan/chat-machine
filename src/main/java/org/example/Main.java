package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String [][] personnes = {{"David", "pervers"}, {"Eric", "astronaute"}, {"Léo", "bûcheron repenti"}, {"Charles", "scientifique"}};
        ChatDeLabo chat = new ChatDeLabo();

        for (int i = 0; i < personnes.length; i++) {
            Personne personne = new Personne(personnes[i][0], personnes[i][1]);
            Camera camera = new Camera(i);
            Observateur obs = new Observateur(personne, chat);
            Observateur obs2 = new Observateur(camera, chat);
        }

        chat.setAction("le chat claque toutes ses thunes au baby-foot !");
    }
}