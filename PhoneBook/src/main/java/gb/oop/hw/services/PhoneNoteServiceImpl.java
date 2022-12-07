package gb.oop.hw.services;

import gb.oop.hw.data.Person;
import gb.oop.hw.data.Phone;
import gb.oop.hw.data.PhoneNote;

import java.util.ArrayList;
import java.util.List;

public class PhoneNoteServiceImpl implements PhoneNoteService{
    private List<PhoneNote> phoneNotes = new ArrayList<>();
    private final PhoneServiceImpl phoneService = new PhoneServiceImpl();
    private final PersonServiceImpl personService = new PersonServiceImpl();


    @Override
    public List<PhoneNote> newPhoneNote(int count) {
        for (int i = 0; i < count; i++) {
            this.phoneNotes.add(new PhoneNote(this.personService.generatePerson(), (List) this.phoneService.generateNumber()));
        }
        return this.phoneNotes;
    }

    @Override
    public void addPhone(PhoneNote phoneNote, Phone phone) {
        phoneNote.addPhone(phone);
    }

    @Override
    public void deletePhone(PhoneNote phoneNote, Phone phone) {
        phoneNote.deletePhone(phone);
    }

    @Override
    public PhoneNote getRecord(int index) {
        return this.phoneNotes.get(index);
    }

    @Override
    public PhoneNote getRecord(String personName) {
        PhoneNote phoneNote = phoneNotes.stream()
                .filter(e -> e.getPerson().getName().equals(personName))
                .findFirst().get();

        return phoneNote;
    }
}
