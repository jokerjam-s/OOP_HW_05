package gb.oop.hw.data;

import java.util.Objects;

/**
 * Телефонный номер, содержит номер абонента и текстовое описание
 */
public class Phone {
    private String text;
    private String number;

    public Phone(String text, String number) {
        this.text = text;
        this.number = number;
    }

    public Phone(String number) {
        this("", number);
    }

    public Phone() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(text, phone.text) && number.equals(phone.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, number);
    }

    @Override
    public String toString() {
        if(this.text.isEmpty()){
            return String.format("{%s}", this.number);
        }
        else {
            return String.format("{%s: %s}", this.text, this.number);
        }
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
