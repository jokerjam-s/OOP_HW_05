package gb.oop.hw.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import gb.oop.hw.data.Person;
import gb.oop.hw.data.PhoneNote;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ReadWritePhoneBookImpl implements ReadWritePnoneBook{
    @Override
    public void writeToFile(List phones, String fileName, String format) {
        format = format.toLowerCase();

        if(format.equals("json")){
            WriteToJson(phones, fileName);
        }

        if(format.equals("xml")){
            WriteToXml(phones, fileName);
        }
    }

    @Override
    public List readFromFile(String fileName, String format) {
        format = format.toLowerCase();

        if(format.equals("json")){
            return readFromJson(fileName);
        }

        if(format.equals("xml")){
            return readFromXml(fileName);
        }

        return null;
    }

    private void WriteToJson(List phones, String fileName){
        Gson gson = new GsonBuilder().serializeNulls().create();

        Logger logger = Logger.getAnonymousLogger();
        List<String> json = new ArrayList<>();

        for (var s: phones){
            json.add(gson.toJson(s, PhoneNote.class));
        }

        try {
            Files.write(Paths.get(fileName), json, StandardOpenOption.CREATE);
            logger.info("Сохранен " + fileName);
        }
        catch (Exception ex){
            logger.info(ex.getMessage());
        }
    }

    private void WriteToXml(List phones, String fileName){

    }

    private List readFromJson(String fileName){
        //Type typeOfList = new TypeToken<List<PhoneNote>>() { }.getType();
        List<PhoneNote> phoneNotes = new ArrayList<>();
        Gson gson = new GsonBuilder().serializeNulls().create();
        Logger logger = Logger.getAnonymousLogger();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String json = reader.readLine();
            while (json != null) {
                PhoneNote phoneNote = gson.fromJson(json, PhoneNote.class);
                phoneNotes.add(phoneNote);
                json = reader.readLine();
            }
            logger.info("Прочитан " + fileName);
        } catch (IOException e) {
            logger.info(e.getMessage());
        }

        return phoneNotes;
    }

    private List readFromXml(String fileName){
        return null;
    }
}
