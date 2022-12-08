package gb.oop.hw.utils;

import gb.oop.hw.data.PhoneNote;

import java.util.List;

public interface ReadWritePnoneBook <P extends PhoneNote>{
    void writeToFile(List<P> phones, String fileName, String format);
    List<P> readFromFile(String fileName, String format);
}
