package gb.oop.hw.utils;

import gb.oop.hw.data.PhoneNote;

public interface ReadWriterPnoneBook {
    public void writeToJson();
    public PhoneNote readFromJson();
}
