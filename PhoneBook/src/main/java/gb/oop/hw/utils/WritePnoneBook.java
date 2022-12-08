package gb.oop.hw.utils;

import gb.oop.hw.data.PhoneNote;

import java.util.List;

public interface WritePnoneBook <P extends PhoneNote>{
    void writeToFile(List<P> phones, String fileName, String format);
}
