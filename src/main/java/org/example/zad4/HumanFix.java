package org.example.zad4;

import java.util.Objects;

public class HumanFix {
    private String firstName;
    private String lastName;
    private final long pesel;

    public HumanFix(String firstName, String lastName, long pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HumanFix humanFix = (HumanFix) o;
        return pesel == humanFix.pesel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesel);
    }
}
