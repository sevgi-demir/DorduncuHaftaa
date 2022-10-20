package com.kodluyoruz.DorduncuHaftaa;

/**
 * @author sevgidemir
 */

public class ToDoList {
    String gun;
    int id;
    String saat;
    String yapilacaklar;
    boolean done;

    public String getGun() {
        return gun;
    }

    public void setGun(String gun) {
        this.gun = gun;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }

    public String getYapilacaklar() {
        return yapilacaklar;
    }

    public void setYapilacaklar(String yapilacaklar) {
        this.yapilacaklar = yapilacaklar;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

}
