package gb.oop.hw.services;

import gb.oop.hw.data.Phone;

public interface PhoneService <P extends Phone> {
    Phone generateNumber();
}
