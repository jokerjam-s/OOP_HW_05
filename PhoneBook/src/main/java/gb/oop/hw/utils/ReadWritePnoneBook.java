package gb.oop.hw.utils;

import gb.oop.hw.data.PhoneNote;

public interface ReadWriterPnoneBook {
    void writeToFile(String fileName, String format);
    PhoneNote readFromFile(String fileName, String format);
}
