package gb.oop.hw.data.person;

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

    @Override
    public String toString() {
        return String.format("[%s - ]")

                "[" + name + ' - ' + notes;
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
