package gb.oop.hw.data;

import java.util.Objects;

/**
 * Персона содержит имя и характеристику.
 */
public class Person {
    private String name;
    private String notes;

    public Person(String name, String notes) {
        this.name = name;
        this.notes = notes;
    }

    public Person(String name) {
        this(name,"");
    }

    public Person() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(notes, person.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, notes);
    }

    @Override
    public String toString() {
        if (this.notes.isEmpty()) {
            return String.format("[%s]", this.name);
        }
        else {
            return String.format("[%s, %s]", this.name, this.notes);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
