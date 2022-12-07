package gb.oop.hw.services;

import gb.oop.hw.data.Person;
import gb.oop.hw.data.Phone;
import gb.oop.hw.data.PhoneNote;

import java.util.List;

public interface PhoneNoteService <P extends Person, N extends Phone> {
    PhoneNote newPhoneNote(P person, List<N> phones);
    PhoneNote newPhoneNote(P person);
    void addPhone(PhoneNote phoneNote, Phone phone);
    void deletePhone(PhoneNote phoneNote, Phone phone);
}
