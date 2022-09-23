package org.example;

public class Camera implements ObservationInterface {
    private int ref;

    public Camera(int ref) {
        this.ref = ref;
    }

    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    @Override
    public void observe(String action) {
        System.out.println("Camera n°" + ref + " a enregistré " + action);
    }
}
