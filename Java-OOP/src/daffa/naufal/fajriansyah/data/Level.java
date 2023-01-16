package daffa.naufal.fajriansyah.data;

import daffa.naufal.fajriansyah.annotation.Fancy;

@Fancy(name = "Level", tags = {"Application", "Java"})
public enum Level {
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String description;

    Level(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
