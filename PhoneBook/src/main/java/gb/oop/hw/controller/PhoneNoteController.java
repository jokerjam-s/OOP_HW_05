package gb.oop.hw.controller;

import gb.oop.hw.services.PhoneNoteServiceImpl;
import gb.oop.hw.utils.ReadWritePhoneBookImpl;

import java.util.logging.Logger;


public class PhoneNoteController {
    private final PhoneNoteServiceImpl service = new PhoneNoteServiceImpl();
    private final ReadWritePhoneBookImpl readWritePhoneBook = new ReadWritePhoneBookImpl();

    public void createPhoneNote(int count){
        service.newPhoneNote(count);
    }

    public void saveToFile(String fileName, String format){
        readWritePhoneBook.writeToFile(service.getPhoneNote(), fileName, format);
    }

    public void loadFromFile(){

    }

}
