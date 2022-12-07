package gb.oop.hw.services;

import gb.oop.hw.data.Person;

public interface PersonService <P extends Person> {
    Person generatePerson();
}
