package gb.oop.hw.utils;

import gb.oop.hw.data.PhoneNote;

public interface ReadWriter {
    public void writeToJson();
    public PhoneNote readFromJson();
}
