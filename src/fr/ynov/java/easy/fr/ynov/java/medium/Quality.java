package fr.ynov.java.medium;

import java.util.Objects;

public class Quality {
    private int id;
    private String name;

    public Quality (int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } if (obj == null || getClass() != obj.getClass()) {
            return false;
        } else {
            Quality quality = (Quality) obj;
            return id == quality.id && Objects.equals(name, quality.name);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public void display() {
        System.out.println("Quality{id=" + id + ", name='" + name + "'}");
    }
    public static void main(String[] args) {
        Quality quality1 = new Quality(1, "Oui");
        Quality quality2 = new Quality(1, "Oui");
        System.out.println("Using == : " + (quality1 == quality2));
        System.out.println("Using equals : " + quality1.equals(quality2));
    }
}
