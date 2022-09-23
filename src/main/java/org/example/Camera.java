package org.example;

public class Camera implements ObservationInterface {
    private String marque;

    public Camera(String marque) {
        this.marque = marque;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    @Override
    public String observe() {
        return null;
    }
}
