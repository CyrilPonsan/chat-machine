package org.example;

public class Personne implements ObservationInterface {
    private String name;
    private String job;

    public Personne(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void observe(String action) {
        System.out.println(name + ", " + job + " a observé " + action);
    }
}
