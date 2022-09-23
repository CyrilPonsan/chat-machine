package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ChatDeLabo chat = new ChatDeLabo();
        String [] names = {"David", "Léo", "Eric"};

        for (int i = 0; i < names.length; i++) {
            Observateur obs = new Observateur(names[i], chat);
            }


        chat.setAction("le chat ne dort plus");
        chat.setAction("le chat joue au baby-foot");
        chat.setAction("le chat grimpe au plafond : meeeeoWWWW");

        chat.setAction("que les chats sont vraiment des branleurs !");

        ArrayList<Observateur> liste = chat.getObservateurs();
        System.out.println("\nObservateurs :");
        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i).getName());
        }
    }
}