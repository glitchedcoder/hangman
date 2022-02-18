package dev.glitchedcoder.hangman.ui;

public enum NSFL {

    ON("NSFL ON"),
    OFF("NSFL OFF");

    public static final NSFL[] values = values();

    private final String name;

    NSFL(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}