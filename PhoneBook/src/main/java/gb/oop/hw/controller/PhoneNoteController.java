package gb.oop.hw.controller;

import gb.oop.hw.data.PhoneNote;
import gb.oop.hw.services.PhoneNoteServiceImpl;
import gb.oop.hw.utils.WritePhoneBookImpl;

import java.util.List;
import java.util.logging.Logger;


public class PhoneNoteController {
    private final PhoneNoteServiceImpl service = new PhoneNoteServiceImpl();
    private final WritePhoneBookImpl writePhoneBook = new WritePhoneBookImpl();

    public void createPhoneNote(int count){
        service.newPhoneNote(count);
    }

    public void saveToFile(String fileName, String format){
        writePhoneBook.writeToFile(service.getPhoneNote(), fileName, format);
    }

    public void showPhones(String nameForShowing){
        List<PhoneNote> list = service.getRecords(nameForShowing);
        Logger logger = Logger.getAnonymousLogger();

        for(PhoneNote p : list){
            logger.info(p.toString());
        }
    }

    public void showPhones(){
        showPhones("");
    }


}
