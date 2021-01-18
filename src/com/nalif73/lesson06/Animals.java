package com.nalif73.lesson06;

public abstract class Animals {
    private String name;
    private int maxRun;
    private int maxSwim;

    public Animals(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public abstract void run(int dist);
    public abstract void swim(int dist);

    public String getName() {
        return name;
    }
    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }
}
