package gb.oop.hw.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PhoneNote <P extends Person, T extends Phone> implements Serializable {
    private P person;
    private List<T> phonesList;

    public void addPhone(T phone){
        phonesList.add(phone);
    }

    public void deletePhone(T phone){
        phonesList.remove(phone);
    }

    public void deletePhone(int index){
        phonesList.remove(index);
    }

    public PhoneNote(P person, List<T> phonesList) {
        this.person = person;
        this.phonesList = phonesList;
    }

    public PhoneNote(P person) {
        this(person, new ArrayList<T>());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNote<?, ?> phoneNote = (PhoneNote<?, ?>) o;
        return person.equals(phoneNote.person) && phonesList.equals(phoneNote.phonesList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, phonesList);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("(");
        result.append(this.person.toString());
        result.append(": ");

        for (Phone p : this.phonesList){
            result.append(p.toString());
        }

        result.append(")");
        return result.toString();
    }

    public P getPerson() {
        return person;
    }

    public void setPerson(P person) {
        this.person = person;
    }

    public List<T> getPhonesList() {
        return phonesList;
    }

    public void setPhonesList(List<T> phonesList) {
        this.phonesList = phonesList;
    }
}
